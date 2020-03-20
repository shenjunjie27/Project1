package com.roob.module1.date315.demo01;

import java.util.Random;


/*
 * int num = r.nextInt() 范围是int的所有范围
 * int num = r.nextInt(3) 实际上代表[0,3)范围
 * */
public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);

        Random r2 = new Random();
        int num2 = r2.nextInt(3);
        System.out.println(num2);
        for (int i = 0; i < 10; i++) {
            int num3 = r2.nextInt(100);
            System.out.print(num3 + "\t");

        }

    }
}
