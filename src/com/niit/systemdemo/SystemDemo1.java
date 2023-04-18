package com.niit.systemdemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        //状态码:
        //0:表示当前虚拟机是正常停止的
        //1:表示告诉虚拟机当前是异常停止
     /*   System.exit(0);
        System.out.println("此段代码无法被执行");*/

        //获取从时间原点开始,到运行这个程序时,所经历的时间毫秒
        //可以用来测量程序执行的时间,(两个时间点的差值)
        long l = System.currentTimeMillis();
        System.out.println(l);

        //数组赋值
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //参数依次表示为:
        // arr->数据源
        //0->从数据源的那个位置开始赋值
        //arr2 ->目的数组
        //0 - > 复制的数组从目的数组的哪个位置开始放入
        // 10 -> 要复制多少个元素
        System.arraycopy(arr, 0, arr2, 0, 10);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println(arr);
        System.out.println(arr2);
    }
}
