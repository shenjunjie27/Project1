package com.roob.module1.date401;

import java.util.Arrays;

public class ComparatorLambda {
    public static void main(String[] args) {
        Person p1 = new Person("阿俊", 20);
        Person p2 = new Person("阿华", 21);
        Person p3 = new Person("阿天", 19);

        Person array[] = {p1, p2, p3};
        Arrays.sort(array, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });

        for (Person person : array) {
            System.out.println(person);
        }
    }
}
