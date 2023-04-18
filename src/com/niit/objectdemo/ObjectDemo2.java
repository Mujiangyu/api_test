package com.niit.objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {


        Student s1= new Student("norman",22);
        Student s2= new Student("norman",22);

        //如果没有重写equals方法,那么默认使用Object类中的方法进行比较,其比较的是对象的地址值
        //一般来说,我们比较对象一般是比较对象内部的属性值,所以有必要重写Object中的equals方法,重写后比较的就是属性值了
        boolean result = s1.equals(s2);
        System.out.println(result);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
