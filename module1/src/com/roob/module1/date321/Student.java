package com.roob.module1.date321;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)//this指的是调用者，这里就是指，如果地址值相同，返回true
            return true;
        if (o == null || getClass() != o.getClass())
            return false;//如果参数对象指向null或者参数对象与调用者对象类不一样，返回false
        Student student = (Student) o;//创建一个新对象的引用接收参数对象强制向下转换
        return age == student.age &&
                Objects.equals(name, student.name);//年龄的值与名字都相同，返回true
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
