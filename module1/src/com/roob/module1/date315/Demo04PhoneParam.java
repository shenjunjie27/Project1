package com.roob.module1.date315;
/*
* 当一个对象作为参数时，实际上传递进去的是地址值
* */
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand="apple";
        one.color="green";
        one.price=3888.0;
        method(one);//传递进去的是地址值

    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
