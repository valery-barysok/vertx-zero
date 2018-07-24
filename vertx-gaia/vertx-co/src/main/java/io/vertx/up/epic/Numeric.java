package io.vertx.up.epic;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.epic.fn.Fn;
import io.vertx.up.log.Annal;

import java.math.BigDecimal;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Number checking
 */
class Numeric {

    private static final Annal LOGGER = Annal.get(Numeric.class);

    static Integer mathMultiply(final Integer left, final Integer right) {
        final Integer leftValue = Fn.getNull(0, () -> left, left);
        final Integer rightValue = Fn.getNull(0, () -> right, right);
        return Math.multiplyExact(leftValue, rightValue);
    }

    @SuppressWarnings("unchecked")
    static <T> T mathJSum(final JsonArray source, final String field, final Class<T> clazz) {
        return Fn.getNull(null, () -> {
            Object returnValue = null;
            if (Double.class == clazz || BigDecimal.class == clazz) {
                final Double result = source.stream().mapToDouble(item -> JsonObject.mapFrom(item).getDouble(field)).sum();
                returnValue = BigDecimal.class == clazz ? new BigDecimal(result) : result;
            } else if (Long.class == clazz) {
                returnValue = source.stream().mapToLong(item -> JsonObject.mapFrom(item).getLong(field)).sum();
            } else if (Integer.class == clazz) {
                returnValue = source.stream().mapToInt(item -> JsonObject.mapFrom(item).getInteger(field)).sum();
            } else {
                LOGGER.error(Info.MATH_NOT_MATCH, clazz);
            }
            return null == returnValue ? null : (T) returnValue;
        }, source, field, clazz);
    }

    private static boolean isMatch(final String regex, final String original) {
        return Fn.getNull(() -> {
            final Pattern pattern = Pattern.compile(regex);
            final Matcher matcher = pattern.matcher(original);
            return matcher.matches();
        }, regex, original);
    }

    static boolean isPositive(final String original) {
        return isMatch("^\\+{0,1}[0-9]\\d*", original);
    }

    static boolean isNegative(final String original) {
        return isMatch("^-[0-9]\\d*", original);
    }

    static boolean isInteger(final String original) {
        return isMatch("[+-]{0,1}0", original) || isPositive(original) || isNegative(original);
    }

    static boolean isDecimal(final String original) {
        return isMatch("[-+]{0,1}\\d+\\.\\d*|[-+]{0,1}\\d*\\.\\d+", original);
    }

    static boolean isReal(final String original) {
        return isInteger(original) || isDecimal(original);
    }

    static Integer randomNumber(final int length) {
        // 1. Generate seed
        final StringBuilder min = new StringBuilder();
        final StringBuilder max = new StringBuilder();
        // 2. Calculate
        min.append(1);
        for (int idx = 0; idx < length; idx++) {
            min.append(0);
            max.append(9);
        }
        // 3. min/max
        final Integer minValue = Integer.parseInt(min.toString()) / 10;
        final Integer maxValue = Integer.parseInt(max.toString());
        final Random random = new Random();
        return minValue + random.nextInt(maxValue - minValue);
    }

    static class Decimal {

        static boolean isPositive(final String original) {
            return isMatch("\\+{0,1}[0]\\.[1-9]*|\\+{0,1}[1-9]\\d*\\.\\d*", original);
        }

        static boolean isNegative(final String original) {
            return isMatch("^-[0]\\.[1-9]*|^-[1-9]\\d*\\.\\d*", original);
        }
    }
}