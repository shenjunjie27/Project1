package com.roob.module1.date315.demo01;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        System.out.println("The sum is "+(a+b));

    }
}
