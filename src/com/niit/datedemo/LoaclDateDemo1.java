package com.niit.datedemo;

import java.time.ZoneId;
import java.util.Set;

public class LoaclDateDemo1 {
    public static void main(String[] args) {


        //获取所有时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //获取当前系统默认时区
        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId1);

        //获取指定的时区
        ZoneId zoneId = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId);
    }
}
