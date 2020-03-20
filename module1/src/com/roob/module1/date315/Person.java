package com.roob.module1.date315;

public class Person {
    String name;
    private int age;//间接访问age 通过getter setter方法
    public void show(){
        System.out.println("Name is "+name+" The age is "+age);
    }
    //这个成员方法，专门用来设置age数据
    public void setAge(int num){
        if (num<100&&num>=9)
        age= num;
        else System.out.println("Data is wrong！！");
    }

    //获取age数据
    public int getAge(){
        return age;
    }
}
