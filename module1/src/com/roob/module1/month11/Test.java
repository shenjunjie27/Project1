package com.roob.module1.month11;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Random random = new Random();
        int i = 0;
        i = random.nextInt(20);
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个整数: ");
        int j = scanner.nextInt();
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i + j = " + (i + j));


    }
}
