package com.niit.mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {

        //abs获取绝对值
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(88));
        //bug
        System.out.println(Math.abs(-2147483648));
        System.out.println("----------------------");
        //向上取整,进一法,想数轴的正方向进一
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.94));
        System.out.println(Math.ceil(-12.94));
        System.out.println("----------------------");

        //向下取整,去尾法,向数轴负方向获取最近的整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.94));
        System.out.println(Math.floor(-12.94));
        System.out.println("----------------------");
        //四舍五入
        //正数想正方向进位去位
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.94));
        //负数想负方向进位去位
        System.out.println(Math.round(-12.94));
        System.out.println(Math.round(-12.34));
        System.out.println("----------------------");
        //获取两个整数的最大值
        System.out.println(Math.max(23, 54));
        //获取两个整数的最小值
        System.out.println(Math.min(23, 54));
        System.out.println("----------------------");
        //获取a的b次幂
        System.out.println(Math.pow(2, 4));
        //细节:如果第二个参数属于0~1,相当于对第一个参数开根号
        System.out.println(Math.pow(16, 0.5));
        //如果第二个参数是负数

        System.out.println("----------------------");

        for (int i = 0; i < 10; i++) {
            //生成0.0~1.0(不包括1 )的随机数
            System.out.println(Math.random());
        }

    }
}
