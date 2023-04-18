package com.niit.objectdemo;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

//如果一个接口中没有抽象方法
//表示当前接口是一个标记性接口
//Cloneable表示一旦实现了,那么当前对象就可被克隆
//如果没有实现,当前类就不能克隆
public class Player implements Cloneable{
    private String name;
    private int id;
    private String password;
    private String path;
    private int[] data;

    public Player() {
    }

    public Player(String name, int id, String password, String path, int[] data) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "Player{name = " + name + ", id = " + id + ", password = " + password + ", path = " + path + ", data = " + arrToString() + "}";
    }
    public String arrToString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+" ");
        }
        return sj.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(name, player.name) && Objects.equals(password, player.password) && Objects.equals(path, player.path) && Arrays.equals(data, player.data);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, id, password, path);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让Java帮我们克隆一个对象,并把克隆后的对象返回出去
        return super.clone();
    }

    protected Object clone2() throws CloneNotSupportedException {
        //先把被克隆的数组获取出来
        int[] data = this.data;
        //创建新数组
        int[] newdata = new int[data.length];
        //拷贝数组
        for (int i = 0; i < data.length; i++) {
            newdata[i] = data[i];
        }
        Player p = (Player) super.clone();
        p.data = newdata;
        return p;
    }
}
