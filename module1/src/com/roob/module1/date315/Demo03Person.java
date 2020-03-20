package com.roob.module1.date315;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name="Jack";
//        person.age=33;
        person.setAge(120);
        person.show();
    }
}
