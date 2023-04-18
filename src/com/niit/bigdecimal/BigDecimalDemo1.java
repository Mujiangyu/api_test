package com.niit.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //用如下构造方法初始化的对象,在数值上可能会不精确
        //不建议使用
       /* BigDecimal bd = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd);
        System.out.println(bd2);
        */
        //通过传递字符串表示的小鼠来创建对象
      /*  BigDecimal bd = new BigDecimal("0.01");
        BigDecimal bd2 = new BigDecimal("0.09");
        System.out.println(bd);
        System.out.println(bd2);
        System.out.println(bd.add(bd2));*/

        //通过静态方法获取对象
      /*  BigDecimal bd3 = BigDecimal.valueOf(1.23);
        System.out.println(bd3);*/


        //细节
        //如果表示的数字不大,没有超出double的范围,建议使用静态方法
        //反之,如果超出了double的取值范围,则建议是使用构造方法
        //如果传递的是0~10之间的整数,方法会返回已经创建好的对象,不会重新new


        //常用方法
        BigDecimal bd0 = BigDecimal.valueOf(10.0);
        BigDecimal bd1 = BigDecimal.valueOf(3.0);

        //除法
//        System.out.println(bd0.divide(bd1));//如果无法除尽的话,会报错

        //除法2
        System.out.println(bd0.divide(bd1, 4, RoundingMode.HALF_UP));


    }
}
