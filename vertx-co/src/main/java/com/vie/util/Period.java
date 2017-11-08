package com.vie.util;

import com.vie.hoc.HFail;
import com.vie.hoc.HNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Period时间处理专用
 */
public class Period {

    private static final List<DateTimeFormatter> DATETIMES = new ArrayList<DateTimeFormatter>() {
        {
            add(Iso.DATE_TIME);
            add(Iso.INSTANT);
            add(Iso.RFC1123_DATE_TIME);
            add(Iso.COMMON);
            add(Iso.READBALE);
        }
    };

    private static final List<DateTimeFormatter> DATES = new ArrayList<DateTimeFormatter>() {
        {
            add(Iso.DATE);
            add(Iso.BASIC_DATE);
            add(Iso.ORDINAL_DATE);
        }
    };

    private static final List<DateTimeFormatter> TIMES = new ArrayList<DateTimeFormatter>() {
        {
            add(Iso.TIME);
        }
    };

    /**
     * 转换日期时间
     *
     * @param literal
     * @return
     */
    public static LocalDateTime toFull(final String literal) {
        final Optional<DateTimeFormatter> hit =
                HNull.get(literal,
                        () -> DATETIMES.stream()
                                .filter(formatter ->
                                        null != HFail.exec(
                                                () -> LocalDateTime.parse(literal, formatter),
                                                null,
                                                literal))
                                .findAny(), Optional.empty());
        return hit.isPresent() ? LocalDateTime.parse(literal, hit.get()) : null;
    }

    /**
     * 转换日期
     *
     * @param literal
     * @return
     */
    public static LocalDate toDate(final String literal) {
        final Optional<DateTimeFormatter> hit =
                HNull.get(literal,
                        () -> DATES.stream()
                                .filter(formatter ->
                                        null != HFail.exec(
                                                () -> LocalDate.parse(literal, formatter),
                                                null,
                                                literal))
                                .findFirst(), Optional.empty());
        return hit.isPresent() ? LocalDate.parse(literal, hit.get()) : null;
    }

    /**
     * 转换时间
     *
     * @param literal
     * @return
     */
    public static LocalTime toTime(final String literal) {
        final Optional<DateTimeFormatter> hit =
                HNull.get(literal,
                        () -> TIMES.stream()
                                .filter(formatter ->
                                        null != HFail.exec(
                                                () -> LocalTime.parse(literal, formatter),
                                                null,
                                                literal))
                                .findFirst(), Optional.empty());
        return hit.isPresent() ? LocalTime.parse(literal, hit.get()) : null;
    }

    /**
     * 是否日期，时间格式
     *
     * @param literal
     * @return
     */
    public static boolean isValid(final String literal) {
        final Date parsed = parse(literal);
        return null != parsed;
    }

    public static Date parse(final String literal) {
        return HNull.get(literal, () -> {
            final int length = literal.length();
            final String pattern = Storage.PATTERNS_MAP.get(length);
            if (null != pattern) {
                // 时间 + 日期
                final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
                Date converted = null;
                if (10 == pattern.length()) {
                    final LocalDate date = LocalDate.parse(literal, formatter);
                    converted = parse(date);
                } else if (15 > pattern.length()) {
                    final LocalTime time = LocalTime.parse(literal, formatter);
                    converted = parse(time);
                } else {
                    final LocalDateTime datetime = LocalDateTime.parse(literal, formatter);
                    converted = parse(datetime);
                }
                return converted;
            } else {
                return parseFull(literal);
            }
        }, null);
    }

    /**
     * 不推荐直接调用，直接调用会有Parse的流程在
     *
     * @param literal
     * @return
     */
    public static Date parseFull(final String literal) {
        return HNull.get(literal, () -> {
            // Datetime解析
            final LocalDateTime datetime = toFull(literal);
            return HNull.chain(datetime,
                    (ref) -> Date.from(ref.atZone(ZoneId.systemDefault()).toInstant()),
                    () -> {
                        // Date解析
                        final LocalDate date = toDate(literal);
                        return HNull.chain(date,
                                (ref) -> Date.from(ref.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()),
                                () -> {
                                    // Time解析
                                    final LocalTime time = toTime(literal);
                                    return null == time ? null : parse(time);
                                });
                    });
        }, null);
    }

    public static boolean equalDate(final Date left, final Date right) {
        // 先比较年
        int leftVal = toItem(left, Calendar.YEAR);
        int rightVal = toItem(right, Calendar.YEAR);
        if (leftVal == rightVal) {
            // 再比较月
            leftVal = toItem(left, Calendar.MONTH);
            rightVal = toItem(right, Calendar.MONTH);
            if (leftVal == rightVal) {
                // 最后比较日期
                leftVal = toItem(left, Calendar.DAY_OF_MONTH);
                rightVal = toItem(right, Calendar.DAY_OF_MONTH);
                return leftVal == rightVal;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int toMonth(final String literal) {
        final Date date = parse(literal);
        return toItem(date, Calendar.MONTH);
    }

    public static int toMonth(final Date date) {
        return toItem(date, Calendar.MONTH);
    }

    public static int toYear(final Date date) {
        return toItem(date, Calendar.YEAR);
    }

    public static int toYear(final String literal) {
        final Date date = parse(literal);
        return toItem(date, Calendar.YEAR);
    }

    private static int toItem(final Date date, final int flag) {
        final Calendar issue = Calendar.getInstance();
        issue.setTime(date);
        return issue.get(flag);
    }

    public static Date parse(final LocalTime time) {
        final LocalDate date = LocalDate.now();
        final LocalDateTime datetime = LocalDateTime.of(date, time);
        return Date.from(datetime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date parse(final LocalDateTime datetime) {
        return Date.from(datetime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date parse(final LocalDate datetime) {
        return Date.from(datetime.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    private Period() {
    }
}