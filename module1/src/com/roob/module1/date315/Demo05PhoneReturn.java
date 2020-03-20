package com.roob.module1.date315;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "HUAWEI";
        one.color = "green";
        one.price = 3888.0;
        return one;
    }
}
