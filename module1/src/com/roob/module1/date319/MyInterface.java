package com.roob.module1.date319;

public interface MyInterface {
    public abstract void method1();
    abstract void method2();
    public void method3();
    void method4();
    public default void methodDefault(){
        System.out.println("接口的默认方法");
    }
    public static void methodStatic(){
        System.out.println("接口的静态方法");
    }

}
