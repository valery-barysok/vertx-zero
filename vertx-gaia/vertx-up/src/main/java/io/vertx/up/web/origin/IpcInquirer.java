package io.vertx.up.web.origin;

import io.reactivex.Observable;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.annotations.Ipc;
import io.vertx.up.atom.Envelop;
import io.vertx.up.func.Fn;
import io.vertx.up.log.Annal;
import io.vertx.up.tool.StringUtil;
import io.vertx.up.tool.mirror.Instance;
import io.vertx.up.tool.mirror.Types;
import io.vertx.zero.exception.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Ipc and @Address must be in @Queue class instead of other specification.
 */
public class IpcInquirer implements Inquirer<ConcurrentMap<String, Method>> {

    private static final Annal LOGGER = Annal.get(IpcInquirer.class);

    /**
     * @param classes all classes must be annotated with @Queue
     * @return
     */
    @Override
    public ConcurrentMap<String, Method> scan(final Set<Class<?>> classes) {
        /**
         * Here are some specification for IPC community
         * 1. As IPC server, must extract @Ipc ( from ) part and registred to Etcd
         * 2. This address is published and other nodes could visit current Micro service.
         */
        final ConcurrentMap<String, Method> addresses = new ConcurrentHashMap<>();
        Observable.fromIterable(classes)
                .flatMap(clazz -> Observable.fromArray(clazz.getDeclaredMethods()))
                .filter(Objects::nonNull)
                .filter(method -> method.isAnnotationPresent(Ipc.class))
                .map(this::ensureTarget)
                .map(this::ensureSpec)
                .map(method -> this.ensureAgent(method, classes))
                .subscribe(method -> {
                    final Annotation annotation = method.getAnnotation(Ipc.class);
                    final String address = Instance.invoke(annotation, "value");
                    addresses.put(address, method);
                });
        return addresses;
    }

    /**
     * Method with @Ipc must contain return type
     *
     * @param method
     * @return
     */
    private Method ensureSpec(final Method method) {
        Fn.flingUp(Types.isVoid(method.getReturnType()), LOGGER,
                IpcMethodReturnException.class, this.getClass(),
                method);
        final Annotation annotation = method.getAnnotation(Ipc.class);
        final String value = Instance.invoke(annotation, "value");
        if (!StringUtil.isNil(value)) {
            // Arguments specification: Non Start Node
            // This specification is only for continue node
            final Class<?>[] argTypes = method.getParameterTypes();
            Fn.flingUp(1 != argTypes.length || Envelop.class != argTypes[0], LOGGER,
                    IpcMethodArgException.class, this.getClass(), method);
        }
        return method;
    }

    /**
     * If declaring class is interface, it must contains implementation classes.
     *
     * @param classes
     * @return
     */
    private Method ensureAgent(final Method method, final Set<Class<?>> classes) {
        // Get declare clazz
        final Class<?> clazz = method.getDeclaringClass();
        if (clazz.isAnnotationPresent(EndPoint.class)
                && clazz.isInterface()) {
            final Long counter = Observable.fromIterable(classes)
                    .filter(item -> clazz != item)
                    .filter(clazz::isAssignableFrom)
                    .count().blockingGet();
            // If counter == 0, zero system disable this definition
            Fn.flingUp(0 == counter, LOGGER,
                    RpcAgentAbsenceException.class, this.getClass(), clazz);
        }
        return method;
    }

    /**
     * If set to or name, must not be null/empty at the sametime.
     *
     * @param method
     * @return
     */
    private Method ensureTarget(final Method method) {
        final Annotation annotation = method.getAnnotation(Ipc.class);
        final String to = Instance.invoke(annotation, "to");
        final String name = Instance.invoke(annotation, "name");
        if (StringUtil.isNil(to) && StringUtil.isNil(name)) {
            // If ( to is null and name is null, value must be required, or the system do not know the direction
            final String from = Instance.invoke(annotation, "value");
            Fn.flingUp(StringUtil.isNil(from), LOGGER,
                    UnknownDirectionException.class, this.getClass(),
                    method);
            // Passed validation.
            return method;
        }
        // to and name must not be null
        Fn.flingUp(StringUtil.isNil(to) || StringUtil.isNil(name), LOGGER,
                IpcMethodTargetException.class, this.getClass(),
                method, to, name);
        return method;
    }
}