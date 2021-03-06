package io.zero.epic;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.zero.epic.fn.Fn;

import java.io.File;
import java.io.FileWriter;

/*
 *
 */
class Out {

    @SuppressWarnings("all")
    static boolean write(final String path, final String data) {
        Fn.safeNull(() -> Fn.safeJvm(() -> {
            final File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            final FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
        }), path, data);
        return true;
    }

    static boolean write(final String path, final JsonObject data) {
        final String target = null == data ? "{}" : data.encodePrettily();
        return write(path, target);
    }

    static boolean write(final String path, final JsonArray data) {
        final String target = null == data ? "[]" : data.encodePrettily();
        return write(path, target);
    }
}
