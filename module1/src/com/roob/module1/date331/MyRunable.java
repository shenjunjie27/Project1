package com.roob.module1.date331;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunable实现类进程");
        System.out.println(Thread.currentThread().getName());
    }
}
