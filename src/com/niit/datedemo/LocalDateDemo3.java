package com.niit.datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateDemo3 {
    public static void main(String[] args) {
        //获取当前时间的对象,带时区
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);

        //获取指定的时间对象,带时区
        //以指定方式
        ZonedDateTime zone1 = ZonedDateTime.of(2023,2,11,
                14,30,30,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zone1);

        //通过instant + 时区的方式获取指定时间对象
        //以指定的时区,获取距离时间远点指定时长的时间
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneid = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zone2 = ZonedDateTime.ofInstant(instant,zoneid);
        System.out.println(zone2);

        //withXXX 修改时间的方法
        ZonedDateTime zone3 = zone2.withYear(2023);
        ZonedDateTime zone4 = zone2.withMonth(2);
        ZonedDateTime zone5 = zone2.withDayOfMonth(11);

        System.out.println(zone3.getYear()+"年"+zone4.getMonth()+"月"+zone5.getDayOfMonth()+"日");

    }
}
