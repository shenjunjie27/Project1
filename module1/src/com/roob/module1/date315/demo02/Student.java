package com.roob.module1.date315.demo02;

/*
 * 1.构造方法与类的名称完全一样，大小写也一样
 * 2.构造方法不需要写返回值名称，void也不需要
 * 3.构造方法不能return一个具体的值
 * 4.如果没有编写构造方法，那就会自动生成一个空的构造方法
 * 5.构造方法可以重载
 *
 *
 *
 *
 * 一个标准的类通常有下面四个组成部分
 * 1.所有的成员变量都要使用private修饰
 * 2.所有的成员变量都要编写一堆Getter/Setter方法
 * 3.编写一个无参数的构造方法
 * 4.编写一个全参数的构造方法
 *
 * 标准类被称为Java Bean(豆)
 * */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
