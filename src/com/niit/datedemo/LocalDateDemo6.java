package com.niit.datedemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo6 {
    public static void main(String[] args) {
//        localDateBetween();
//        LocalTimeBetween();
        LocalDateTime today = LocalDateTime.now();

        LocalDateTime brithDate = LocalDateTime.of(2000,3,6,12,00,00);

        System.out.println(ChronoUnit.YEARS.between(brithDate, today));//相差年分
        System.out.println(ChronoUnit.DAYS.between(brithDate, today));//相差天数
        System.out.println(ChronoUnit.MONTHS.between(brithDate, today));//相差月数
        System.out.println(ChronoUnit.HOURS.between(brithDate, today));//相差小时数
        System.out.println(ChronoUnit.MINUTES.between(brithDate, today));//相差分钟数
        System.out.println(ChronoUnit.SECONDS.between(brithDate, today));//相差秒数
        System.out.println(ChronoUnit.MILLIS.between(brithDate, today));//相差毫秒数
        System.out.println(ChronoUnit.MICROS.between(brithDate, today));//相差微妙数
        System.out.println(ChronoUnit.NANOS.between(brithDate, today));//相差纳秒数
        System.out.println(ChronoUnit.DECADES.between(brithDate, today));//相差十年数
        System.out.println(ChronoUnit.CENTURIES.between(brithDate, today));//相差世纪数
        System.out.println(ChronoUnit.MILLENNIA.between(brithDate, today));//相差千年数
        System.out.println(ChronoUnit.ERAS.between(brithDate, today));//相差纪元数


    }

    private static void LocalTimeBetween() {
        LocalDateTime today = LocalDateTime.now();

        LocalDateTime brithDate = LocalDateTime.of(2000,3,6,12,00,00);

        //between是静态方法可以通过类名直接来调用
        Duration duration = Duration.between(brithDate,today);
        System.out.println("相隔时间间隔对象"+duration);

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }

    private static void localDateBetween() {
        LocalDate today = LocalDate.now();

        LocalDate brithDate = LocalDate.of(2000,3,6);

        //period只能获取年月日的相隔时间
        Period between = Period.between(brithDate, today);
        System.out.println("相差时间间隔"+between);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());

        System.out.println(between.toTotalMonths());
    }
}
