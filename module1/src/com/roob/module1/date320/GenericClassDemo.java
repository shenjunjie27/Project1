package com.roob.module1.date320;

public class GenericClassDemo {
    public static void main(String[] args) {
        MyGenericClass<String> myGenericClass = new MyGenericClass<String>();
        myGenericClass.setMvp("林娜琏最可爱");
        String mvp = myGenericClass.getMvp();
        System.out.println(mvp);
        MyGenericClass<Integer> myGenericClass2 = new MyGenericClass<>();
        myGenericClass2.setMvp(123);
        Integer mvp2 = myGenericClass2.getMvp();
        System.out.println(mvp2);
    }
}
