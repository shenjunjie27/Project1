package com.roob.module1.date314;

//数组是一种引用类型
//数组类型统一
//数组的长度在程序运行期间不可改变
//数组的初始化分为动态出书画 静态初始化
/*
1.动态初始化：指定长度
2.静态初始化：指定内容，虽然没有直接指定长度，但是可以自动退算到长度
3.初始化都可以拆分成两个步骤
4.静态初始化如果使用省略格式，不能拆分成两个步骤
*/

public class Array {
    public static void main(String[] args) {
        int[] arrayA = new int[10];//动态初始化
        int[] arratB = {1, 2, 3};//静态初始化，省略的格式
        String[] arrayC = new String[100];
        int[] arrayD=new int[] {5,15,25};//静态初始化
    }
}
