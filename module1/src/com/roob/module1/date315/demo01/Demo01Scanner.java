package com.roob.module1.date315.demo01;

import java.util.Scanner;

/*
 * 引用类型
 * 1.导包 java.lang 不需要导包
 * 2.创建
 * 创建对象
 * 3.使用
 * 调用其中的成员方法
 *
 *
 * 获取键盘输入的一个int数字 int num = sc.nextInt();
 * 获取键盘输入的一个字符串 String str = sc.next();
 * */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建对象
        //System.in代表从键盘输入
        int num = sc.nextInt();
        System.out.println(num);

        String str = sc.next();
        System.out.println(str);
    }
}
