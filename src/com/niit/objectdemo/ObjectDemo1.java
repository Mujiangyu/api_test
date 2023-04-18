package com.niit.objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {


        Student stu = new Student();
        String s = stu.toString();
        //细节:
        //System是类名
        //out是类中的一个静态变量
        //System.out就可以获得打印的对象
        //println()是一个方法
        //方法中的参数就表示我们要打印的内容
        //当我们要打印一个对象的时候,底层会调用对象的tostring方法,把对象变成字符串,打印在控制台上,并换行
        System.out.println(s);

        //如果我们打印一个对象,想要看到属性值,可以重写tostring方法

    }
}
