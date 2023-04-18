package com.niit.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        /*
        * Java自从1995年问世以来,经历了很多的版本,目前企业中使用最多的就是Java8和Java11,
        * 主要是因为这两个版本是长期支持版本,下一个长期支持版本是Java17,相信在不久的将来,Java17也会逐渐登上历史的舞台
        * */
        String str = "Java自从1995年问世以来,经历了很多的版本,目前企业中使用最多的就是Java8和Java11," +
                "主要是因为这两个版本是长期支持版本,下一个长期支持版本是Java17,相信在不久的将来,Java17也会逐渐登上历史的舞台";
//        extracted(str);
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器
        Matcher m = p.matcher(str);
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }

    }

    private static void extracted(String str) {

        //Pattern:表示正则表达式
        //Matcher:文本匹配器,按照正则表达式的规则去读取字符串,从头开始读取

        //获取正则表达式对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器
        Matcher m = p.matcher(str);
        //拿着文本匹配器从头开始读取,寻找是否有满足的子串,如果没有会返回false,如果有,返回true,在底层记录子串的起始索引和结束索引+1
        boolean b = m.find();
        String s = m.group();
        System.out.print(s+" ");
        //第二次调用find时,会继续读取后面的内容
        /*b = m.find();
        String s1 = m.group();
        System.out.println(s1);*/
    }
}
