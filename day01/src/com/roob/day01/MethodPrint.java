package com.roob.day01;

public class MethodPrint {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!!!"+"第"+(i+1)+"次打印");

        }
    }
}
