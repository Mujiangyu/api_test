package com.niit.biginteger;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //创建两个biginteger对象
        BigInteger bg1 = BigInteger.valueOf(10);
        BigInteger bg2 = BigInteger.valueOf(5);
        BigInteger bg3 = BigInteger.valueOf(1);

        //假发
        BigInteger res = bg1.add(bg2);
        System.out.println(res);
        //减法
        BigInteger res2 = bg1.subtract(bg2);
        System.out.println(res2);
        //乘法
        BigInteger res3 = bg1.multiply(bg2);
        System.out.println(res3);
        //除法
        BigInteger res4 = bg1.divide(bg2);
        System.out.println(res4);
        //除法2:获取商和余数
        BigInteger[] res5 = bg1.divideAndRemainder(bg2);
        for (int i = 0; i < res5.length; i++) {
            System.out.print(res5[i]+" ");
        }
        System.out.println();//换行
        //比较两个数
        System.out.println(bg1.equals(bg2));
        //次幂,不能直接传biginteger类型的参数,
        System.out.println(bg1.pow(2));
        System.out.println(bg2.pow(2));
        //比较两个数
        System.out.println(bg1.max(bg2).max(bg3));
        System.out.println(bg1.min(bg2).min(bg3));
        //将biginteger对象转换为基本数据类型,不能超出基本类型的范围
        BigInteger bg4 = BigInteger.valueOf(100000);
        int i = bg4.intValue();
        System.out.println(i);


    }
}
