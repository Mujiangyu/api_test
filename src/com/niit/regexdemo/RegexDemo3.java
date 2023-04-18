package com.niit.regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        //正则表达式的分组
        //从左往右,以左括号为准,第一个为第一组,第二个为第二组...

        //最后的\\1表示复用正则表达式中的第一组,即改正则表达式要求首尾相同
        //捕获分组
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("11231".matches(regex1));

        //非捕获分组
        //(?:)     (?=)     (?!)
    }
}
