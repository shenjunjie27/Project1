package com.roob.module1.date323;


//可变参数(数据类型...变量名)
//可变参数底层是一个数组,根据传递参数个数的不同,会创建不同长度的数组,
//传递的参数可以是0个
public class VarArgs {
    public static void main(String[] args) {
        int i = add(1, 2, 4, 6);
        System.out.println(i);

    }

    public static int add(int... arr) {//可变参数格式
        System.out.println(arr);//[I@723279cf 底层是一个数组
        System.out.println(arr.length);//0
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//累加
            sum += arr[i];
        }
        return sum;
    }
}
