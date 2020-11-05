package com.roob.module1.date318;

//快排,主要有用到递归
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 76, 85, 7, -9, 32, 89, -198, 99, 66, 78, 192};
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
        key = arr[left];
        while (i < j) {
            while (key <= arr[j] && i < j)
                j--;
            while (key >= arr[i] && i < j)
                i++;
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        quickSort(arr, left, j - 1);
        quickSort(arr, j + 1, right);
    }

}
