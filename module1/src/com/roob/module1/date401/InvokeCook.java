package com.roob.module1.date401;

public class InvokeCook {
    public static void main(String[] args) {
      /*  new Thread(() -> {
            System.out.println("小梅梅恰饭了");
        }).start();*/
        invokeCook(() -> System.out.println("小梅梅吃饭饭"));
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
