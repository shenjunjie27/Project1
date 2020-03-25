package com.roob.module1.date325;

public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 52, 2};
        int index = 4;
        int element = getElement(arr, index);
        System.out.println(element);
        System.out.println("over");
    }

    public static int getElement(int[] arr, int index) {
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("哥们儿,越界了");
        }
        int element = arr[index];
        return element;
    }
}
