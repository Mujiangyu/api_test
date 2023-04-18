package com.niit.regexdemo;

import java.util.Scanner;

public class RegexDemo1 {
    public static void main(String[] args) {

        String qq = "2510881172";
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        boolean flag =check(str,qq);
//        System.out.println("qq号是否正确"+flag);
//        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        //表示任意一个字符 .
//        System.out.println("你".matches("."));//ture
//        System.out.println("你".matches(".."));//false
//        System.out.println("你好".matches(".."));//true
        // \\d 标配是任意一个数字
        System.out.println("3".matches("\\d"));//true
        // \\w 表示[a-zA-Z_0-9]中的任意一个
        System.out.println("_".matches("\\w"));//true
        System.out.println("a".matches("\\w"));//true
        // \\W 表示任意一个非\\w的字符
        System.out.println("@".matches("\\W"));//true
        // \\w{a,b}表示至少a位至多b位,b可以不写,表示没有上限
        System.out.println("fassdfsdaf".matches("\\w{10,}"));//true
        // \\s 表示一个空白字符 \\S表示非空白字符 \\D表示一个非数字字符


        String regex = "(?:(?:\\+|00)86)?1(?:(?:3[\\d])|(?:4[5-7|9])|(?:5[0-3|5-9])|(?:6[5-7])|(?:7[0-8])|(?:8[\\d])|(?:9[1|8|9]))\\d{8}";
    }

    public static boolean check(String str, String qq) {
        //先把异常数据过滤,其余的都符合要求
        if (str.charAt(0) == 0) {
            return false;
        }
        if (str.length() < 6 || str.length() > 20) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != qq.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
