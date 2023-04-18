package com.niit.datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo4 {
    public static void main(String[] args) {

        //获取时间对象
        //atZone设置时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");

        //格式化
        System.out.println(dateTimeFormatter.format(time));







    }
}
