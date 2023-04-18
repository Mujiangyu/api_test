package com.niit.integer;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //自动装箱:把基本数据类型自动的包装成其对应的包装类
        //自动拆箱:把包装类自动的标称其对应的基本数据类型

        //自动装箱-->在底层,此时还回去自动调用静态方法valueof得到一个integer对象,之不过这个动作不需要自己去操作了
        Integer i= 10;
        Integer i1 = new Integer(10);
        //自动装箱的动作
        int i2 = i1;

    }
}
