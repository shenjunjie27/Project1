package com.roob.module1.date318;
//快排,主要有用到递归
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 76, 85, 7, -9, 32, 89, -198 ,99,66,78,192};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i, j, key, t;
        if (left > right)
            return;
        i = left;
        j = right;
        // temp就是基准位
        key = arr[left];
        while (i < j) {
            // 先看右边，依次往左递减
            while (key <= arr[j] && i < j)
                j--;
            // 再看左边，依次往右递增
            while (key >= arr[i] && i < j)
                i++;
            // 如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        // 最后将基准为与i和j相等位置的数字交换
        arr[left] = arr[i];
        arr[i] = key;
        // 递归调用左半数组
        quickSort(arr, left, j - 1);
        // 递归调用右半数组
        quickSort(arr, j + 1, right);
    }

}
