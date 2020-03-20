package com.roob.module1.date317.demo01;


//public boolean equals(Object obj);
//public boolean equalsIgnoreCase(String str);
//参数可以是任何对象,参数是字符串并且内容相同的时候会返回true,否则为false
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals((str3)));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        System.out.println(str4.equals(str1));
        System.out.println(str1.equalsIgnoreCase(str4));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

}
