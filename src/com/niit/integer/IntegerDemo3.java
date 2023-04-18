package com.niit.integer;

public class IntegerDemo3 {
    public static void main(String[] args) {
        //把整数转成二进制,八进制和十六进制
        String s = Integer.toBinaryString(100);
        System.out.println(s);
        String s1 = Integer.toOctalString(100);
        System.out.println(s1);
        String s2 = Integer.toHexString(100);
        System.out.println(s2);

        //将字符串类型的整数转成int 类型的整数
        //强类型语言:每种数据在java中都有各自的类型,不是同一种数据类型,是无法直接计算的
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i+1);
        //细节1:括号中的参数只能有数字,不能有其他,否则报错
        //细节2:8中包装类中,除了Character,其他的包装类中都有parsexxx()的方法,进行类型转换
    }
}
