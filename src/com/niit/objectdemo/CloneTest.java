package com.niit.objectdemo;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        Player p1 = new Player("norman", 101, "123", "gril11", data);

        //克隆对象
        //不能直接调用,因为clone方法是定义在java.lang包下的protected方法,只能在包内或者子类中调用
        //如果想要使用,则必须在子类要重写clone方法
        //细节:
        //方法在底层会帮我们创建一个对象,并将原来对象中的数据拷贝到新的对象中去
        //书写细节:
        //1.重写object中的clone方法
        //2.让JavaBean类实现cloneable接口
        //3.创建原对象,并调用colone方法
        //浅克隆
        Object p2 =(Player) p1.clone();
        //深克隆
        //可以用第三方工具实现深克隆--->gson.jar ====>需要导入jar包
        //gson g = new gson();
        //String s = g.toJson(p1)
        //Player p2 = g.fromJson(s,Player.class)
        Object p3 =(Player) p1.clone2();
        //验证object中的克隆是浅克隆
        //深克隆的代码需要自己从写,创建一个行的引用对象,存储原来引用对象中的数据
        int[] arr = p1.getData();
        arr[0] = 3;

        boolean result = p1.equals(p2);

        boolean result1 = p1.equals(p2);
        System.out.println(result);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
