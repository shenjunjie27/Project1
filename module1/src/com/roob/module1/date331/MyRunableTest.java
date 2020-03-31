package com.roob.module1.date331;

public class MyRunableTest {


    public static void main(String[] args) {
        MyRunable mr = new MyRunable();
        new Thread(mr, "阿俊").start();
        System.out.println(Thread.currentThread().getName());
        new Thread("小俊") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i + "小俊俊");
                }
            }
        }.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i + "大俊俊");
                }
            }
        };
        new Thread(r, "大俊").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i + "大大俊俊");
                }
            }
        }, "大大俊").start();
//        int i = 0;
//        while (true) {
//            System.out.println(i++);//无限循环,写着玩的
//        }
    }

}
