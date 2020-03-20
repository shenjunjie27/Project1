package com.roob.module1.date316.demo01;

//字符串内容永不可变
//字符串可以共享使用
//字符串效果相当于char[]字符数组,但是底层原理是byte[]字节数组
/*
 * 创建字符串的3+1种常见方式
 * 1.public String();
 * 2.public String(char[] array);
 * 3.public String(byte[] array);
 * 直接创建:
 * String str = "Hello";
 * */
public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);
        char[] array = {'P', 'P', 'A', 'P'};
        String str2 = new String(array);
        System.out.println(str2);
        byte[] array2 = {97, 98, 99, 98, 97};
        String str3 = new String(array2);
        System.out.println(str3);
        String str4 = "林娜琏";
        System.out.println(str4);


    }
}
