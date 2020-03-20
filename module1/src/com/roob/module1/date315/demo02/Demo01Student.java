package com.roob.module1.date315.demo02;

public class Demo01Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Jack");
        stu1.setAge(20);
        System.out.println("Name is "+stu1.getName());
        System.out.println("Age is "+stu1.getAge());
        System.out.println("=======================");

        Student stu2= new Student("Mike",23);
        System.out.println("Name is "+stu2.getName());
        System.out.println("Age is "+stu2.getAge());
    }
}
