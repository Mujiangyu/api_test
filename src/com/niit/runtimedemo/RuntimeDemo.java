package com.niit.runtimedemo;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //runtime只有一个引用
        Runtime ri = Runtime.getRuntime();

        //停止虚拟机
     /*   Runtime.getRuntime().exit(0);
        System.out.println("===");*/

        //获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //JVM能从系统中获取的总内存的大小/单位是byte
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //JVM已经从系统中获取的内存总数
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //JVM剩余内存的大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //运行cmd命令
//        Runtime.getRuntime().exec("qq.exe");
        //shutdown:关机
        //-s:默认在一分钟后关机
        //-s -t 指定时间: 在指定的时间后关机(单位为秒)
        //-a :取消关机
        //-r :关机重启
        Runtime.getRuntime().exec("shutdown -a");

    }
}
