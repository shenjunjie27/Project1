package com.roob.module1.date318;

public class StringConvert1 {
    public static void main(String[] args) {
        char[] chars="Hello".toCharArray();//转换成字符数组
        System.out.println(chars[0]);

        byte[] bytes = "sbc".getBytes();//字符串转换成底层字节数组
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);


    }
}
