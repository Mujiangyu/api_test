package com.niit.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //定义一个字符串表示时间
        String str = "2023-2-11 15:30:30";
        //利用空参构造v黄健SimpleDateFormat对象
        //细节:创建对象的格式要和字符串的格式完全一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);


    }

    private static void method() {
        //利用空参构造创建指定格式,默认格式            70-1-1 上午8:00
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date();
        String format = sdf.format(d);
        System.out.println(format);

        //利用有参构造创建指定格式            1970年01月01日 08:00:00
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str = sdf2.format(d);
        System.out.println(str);

        //
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str1 = sdf3.format(d);
        System.out.println(str1);
    }
}
