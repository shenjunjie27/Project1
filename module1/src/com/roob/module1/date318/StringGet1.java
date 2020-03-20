package com.roob.module1.date318;
/*
public int length()
piblic String concat (String str)
public char charAt(int index)
public int indexOf(String str)


*/

public class StringGet1 {
    public static void main(String[] args) {
        int length = "saasdasdsadasdasdasdas".length();
        System.out.println(length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


        //获取指定位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引处的字符是" + ch);

        //查找参数字符串在本来字符串中第一次出现的索引位置
        //如果没有,返回-1
        int num = "Hello".indexOf("ll");
        System.out.println("ll出现的第一次索引是" + num);
    }
}
