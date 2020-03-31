package com.roob.module1.date331;
/*
创建多线程的第一种方法
1.创建一个Thread的子类
2.重写其中的run方法
3.创建这个子类的对象,然后调用start方法
抢占式调用
随机性打印

*/

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        //mt.run();//单线程调用,是main线程调用的,没有开启一个新的线程
        // run();
        mt.setName("阿俊");
        mt.start();//开辟新的栈空间,执行run方法
        new MyThread("旺财").start();
    }

    public static void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("main" + i);
        }
    }
}
