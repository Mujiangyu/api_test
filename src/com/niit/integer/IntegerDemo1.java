package com.niit.integer;

public class IntegerDemo1 {
    public static void main(String[] args) {
        //构造方法创建integer对象
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);

        //利用静态你方法获取integer对象
        Integer integer = Integer.valueOf(12);
        Integer integer1 = Integer.valueOf("123");
        Integer integer2 = Integer.valueOf("123", 8);     //将8进制下的123转换为十进制
        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);

        //两种方式获取对象的区别
        Integer integer3 = Integer.valueOf(127);
        Integer integer4 = Integer.valueOf(127);
        System.out.println(integer3 == integer4);

        Integer integer5 = Integer.valueOf(128);
        Integer integer6 = Integer.valueOf(128);
        System.out.println(integer6 == integer5);

        Integer integer7 = new Integer(127);
        Integer integer8 = new Integer(127);
        System.out.println(integer7 == integer8);
    }
}
