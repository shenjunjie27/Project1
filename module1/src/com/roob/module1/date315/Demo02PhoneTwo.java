package com.roob.module1.date315;

public class Demo02PhoneTwo {
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




        Phone iPhoneX = new Phone();
        iPhoneX.brand="Apple";
        iPhoneX.color="Black";
        System.out.println("iPhoneX's brand is "+iPhoneX.brand+".");
        System.out.println("iPhoneX's color is "+iPhoneX.color+".");
        iPhoneX.price=7899.0;
        System.out.println("iPhoneX's price is $"+iPhoneX.price+".");
        iPhoneX.call("Cook");
        iPhoneX.sendMessage();
    }
}
