package com.niit.datedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo5 {
    public static void main(String[] args) {
        //只有年月日,没有时分秒
        //获取当前时间的日历对象
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        //获取指定时间的日历对象
        LocalDate localDate = LocalDate.of(2023,1,1);
        System.out.println(localDate);

        //用get方法获取日历中的属性值
        int year = localDate.getYear();
        //获取month的两种方式
        //英文方式
        Month month = localDate.getMonth();
        int month1 = month.getValue();//获取阿拉伯数字表示的月份
        //整数方式
        int month2 = localDate.getMonthValue();
        //获取日
        int day = localDate.getDayOfMonth();
        //获取一年中的dijitian
        int day1 = localDate.getDayOfYear();
        //获取一周中的第几天,即星期几,英文表示
        DayOfWeek day2 = localDate.getDayOfWeek();
        System.out.println(year);
        System.out.println(month);
        System.out.println(month1);
        System.out.println(month2);
        System.out.println(day);
        System.out.println(day1);
        System.out.println(day2);
    }
}
