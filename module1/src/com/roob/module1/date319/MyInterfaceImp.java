package com.roob.module1.date319;

public class MyInterfaceImp implements MyInterface {
    @Override
    public void methodDefault() {
        System.out.println("重写默认方法");
    }

    @Override
    public void method1() {
        System.out.println("重写抽象方法一");
    }

    @Override
    public void method2() {
        System.out.println("重写抽象方法二");
    }

    @Override
    public void method3() {
        System.out.println("重写抽象方法三");
    }

    @Override
    public void method4() {
        System.out.println("重写抽象方法四");


    }
}
