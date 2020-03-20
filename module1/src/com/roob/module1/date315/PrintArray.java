package com.roob.module1.date315;

import java.util.Arrays;

/*
 * 面向过程：实现功能，具体步骤，详细细节。
 * 面向对象：实现功能，不关心具体步骤，而是找一个具有该功能的人，帮我做事。
 *
 * 面向对象包括三大基本特征：封装，继承和多态
 * 类和对象：
 * 类：一组相关属性和行为的集合
 * 类与对象的关系
 * 类是抽象的，是对一类事物的描述
 * 对象是具体的，是一类事物的实例
 * 类是对象的模板，对象是类的实体
 * */
public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //要求打印格式为：[10, 20, 30, 40, 50]
        //面向过程
        //System.out.print("[" + array[0] + "," + array[1] + "," + array[2] + "," + array[3] + "," + array[4] + "]");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]+"]");
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println("================");
        //面向对象

        System.out.println(Arrays.toString(array));
    }

}
