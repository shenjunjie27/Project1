package com.roob.module1.date323;

public class ChageArgs {
    public static void main(String[] args) {
        int[] arr = {1, 4, 62, 431, 2};
        int sum = getSum(arr);
        System.out.println(sum);
        int sum2 = getSum(6, 7, 2, 12, 2121);
        System.out.println(sum2);
    }

    //可变参数写法
    public static int getSum(int... arr) {//可变参数要写在参数列表的末尾位置
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
}
