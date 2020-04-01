package com.roob.module1.date401;

public class LambdaRunnable {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("多任务执行!")).start();//启动线程
    }
}
