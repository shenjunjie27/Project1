package com.roob.module1.date315.demo01;

import java.util.Scanner;

/*
 * 匿名对象只能使用一次
 * 使用建议:如果确定这个对象只需要使用一次,可以使用匿名对象
 * */
public class Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.showName();
        one.name = "Mike";
        one.showName();
        System.out.println("=============");
        new Person().showName();
        new Person().name = "Jack";
        new Person().showName();
        //这里使用了匿名对象,只输入一次
        System.out.print("=================\n请输入一个整数1\n");
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是:" + num);
        System.out.println("================");
        //使用匿名对象作为参数
        methodParam(new Scanner(System.in));

    }

    public static void methodParam(Scanner sc) {
        System.out.println("请输入一个整数2");
        System.out.println("输入的是:"+ sc.nextInt());


    }
}
