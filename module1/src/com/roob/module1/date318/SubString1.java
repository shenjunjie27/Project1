package com.roob.module1.date318;

/*
字符串的截取方法
*/

public class SubString1 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(2);//2-end
        String str3 = str1.substring(0,5);//截取0-4号索引元素,[0,5)
        System.out.print(str1+"\n"+str2+"\n"+str3+"\n");
    }
}
