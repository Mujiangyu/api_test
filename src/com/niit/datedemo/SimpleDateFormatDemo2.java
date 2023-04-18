package com.niit.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //解析字符串,将其转换为date类型的数据
        Date date = sdf.parse(str);

        //指定要转换的格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String str1  =  sdf1.format(date);
        System.out.println(str1);
    }
}
