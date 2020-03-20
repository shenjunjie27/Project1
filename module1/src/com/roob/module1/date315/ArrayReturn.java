package com.roob.module1.date315;

/*
 * 一个方法只能有0或者1个返回值
 *如果想返回多个数， 可以返回一个数组
 *
 *
 * */
public class ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(1, 2, 3);
        System.out.println("The sum is " + result[0]);
        System.out.println("The avg is " + result[1]);

    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        //数组存放多个结果
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;

    }
}
