package com.niit.biginteger;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //1.获取一个随机的大整数
        //0 ~ 2 的4次方 -1
        /*Random r = new Random();
        BigInteger bg = new BigInteger(4,r);
        System.out.println(bg);*/

        //获取一个指定的大整数,字符串中只能是整数,出现其他的会报错
        /*BigInteger bg2 = new BigInteger("10000000000000000000000000000000000000000");
        System.out.println(bg2);*/

        //获取一个指定进制的大整数,字符串中的数字串要符合进制规则
        //将指定进制的大整数转换成十进制的大整数
       /* BigInteger bg3 = new BigInteger("100001",2);
        BigInteger bg4 = new BigInteger("123",16);
        System.out.println(bg3);
        System.out.println(bg4);*/

        //静态方法获取biginteger对象,内部存在优化
        //取值范围比较小,只能取long范围内的大整数,
        //在内部,对常用的数字进行了优化 -16 ~ 16
        //提前把-16 ~ 16先创建好Integer对象,如果多次获取不会重新创建新的
        BigInteger bg5 = BigInteger.valueOf(100000000000L);
        System.out.println(bg5);

        BigInteger bg6 = BigInteger.valueOf(16);
        BigInteger bg7 = BigInteger.valueOf(16);
        System.out.println(bg6 == bg7);

        BigInteger bg8 = BigInteger.valueOf(17);
        BigInteger bg9 = BigInteger.valueOf(17);
        System.out.println(bg8 == bg9);


    }
}

