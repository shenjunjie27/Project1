package com.roob.module1.date314;
//方法的重载，类似方法可以同名不同参数，或者参数类型不同，顺序不同
//与参数的名字无关，不能根据参数的名称来进行重载
//与方法的返回值无关
public class Overload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3,4));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1,3));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c,int d) {
        return a + b + c+ d ;
    }
}
