package com.roob.module1.date319;

public class PersonImp {
    public static void main(String[] args) {
        Person one = new Person("林娜琏",24);
        System.out.println(one.toString());
        Person two= new Person("林娜琏",24);
        System.out.println(one.equals(two));
    }


}
