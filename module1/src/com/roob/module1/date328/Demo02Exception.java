package com.roob.module1.date328;

public class Demo02Exception {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int e = getElement(arr, 3);
        System.out.println(e);

    }

    public static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }
}
