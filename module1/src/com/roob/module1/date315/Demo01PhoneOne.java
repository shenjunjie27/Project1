package com.roob.module1.date315;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        iPhone.brand="Apple";
        iPhone.color="Black";
        System.out.println("iPhone's brand is "+iPhone.brand+".");
        System.out.println("iPhone's color is "+iPhone.color+".");
        iPhone.price=3899.0;
        System.out.println("iPhone's price is $"+iPhone.price+".");
        iPhone.call("Cook");
        iPhone.sendMessage();
    }
}
