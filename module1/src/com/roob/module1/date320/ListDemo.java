package com.roob.module1.date320;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//创建一个List对象,这个对象是String类型的

        list.add("图图");//尾部添加元素
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);
        System.out.println("往索引位置1的地方add了一个元素,效果可以称之为插入");
        list.add(1,"没头脑");//list.add(int index,String s)
        //往索引为1的位置添加了元素,之后的元素依次往后位移
        System.out.println(list);
        System.out.println("==================");

        System.out.println("删除索引位置为2的元素");
        System.out.println(list.remove(2));//list.remove(int index)
        System.out.println(list);
        System.out.println("==================");


        list.set(0,"秀智");//list.set(int index,String s)
        System.out.println("对索引位置为1的元素进行了替换");
        System.out.println(list);
        System.out.println("======================");

        //常规遍历
        System.out.println("常规遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //增强型for循环,一般只用来遍历
        System.out.println("增强型for循环");
        for(String string : list){
            System.out.println(string);
        }
    }
}
