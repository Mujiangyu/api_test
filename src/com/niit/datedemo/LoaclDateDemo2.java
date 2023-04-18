package com.niit.datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LoaclDateDemo2 {
    public static void main(String[] args) {


        //获取当前时间的Instant对象
        Instant now  = Instant.now();
        System.out.println(now);

        //获取指定时间的instant对象
        Instant instant = Instant.ofEpochMilli(0L);
        System.out.println(instant);
        Instant instant1 = instant.ofEpochSecond(1L);
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000L);//第二个参数表示纳秒数
        System.out.println(instant2);

        //指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);


        System.out.println("------------------------------------------------------");
        //isXXX判断  befor  after
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);
        boolean before = instant3.isBefore(instant4);
        System.out.println(before);

    }
}
