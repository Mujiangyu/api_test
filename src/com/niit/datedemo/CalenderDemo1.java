package com.niit.datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo1 {
    public static void main(String[] args) {


        //Calender 是一个抽象类,不能直接new,要通过一个静态方法获取子类
        //底层会根据系统所在的不同时区,获取不同的日历对象,默认表示当前时间
        //把时间中的纪元,年,月,日,时,分,秒,星期等都放在一个数组中
        //0 : 纪元
        //1 : 年
        //2 : 月
        //3 : 一年中的第几周
        //4 : 一个月中的第几周
        //5 : 一个月中的第几天(日)
        //...16
        //获取月份,范围是0~11
        //星期,星期日是一周中的第一天  1代表星期日, 2 代表星期一依次类推
        Calendar c = Calendar.getInstance();
//        System.out.println(c);

        //修改日历时间
        Date date = new Date(0L);
        c.setTime(date);
//        System.out.println(c);


        //java再Calendar类中,把索引定义成常量

        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.DATE,11);
        //月份如果超过12 会自动向年份进一
        c.set(Calendar.MONTH,1);


        //调用方法,增加一个月
        c.add(Calendar.MONTH,1);
        c.add(Calendar.DATE,9);


        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1 ;
        int day = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);


        System.out.println(year + ", " + month + ", " + day+", "+getWeek(week));


    }

    //查表法
    public static String getWeek(int index){
        String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[index];
    }
}
