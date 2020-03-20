package com.roob.module1.date315.demo03;


import java.util.ArrayList;

//ArrayList集合的长度是可以改变的
//<E> E只能是引用类型 不能是基本类型
//直接打印ArrayList 得到的不是地址值而是内容
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //添加数据,使用add方法
        list.add("林娜琏");
        System.out.println(list);

        list.add("李知恩");
        list.add("金所炫");
        list.add("朴宝英");
        System.out.println(list);
    }
}
