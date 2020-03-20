package com.roob.module1.date315;

/*
1.数组元素反转，对称位置的元素交换
int max = array.length-1
2.数组可以作为方法的参数，当调用方法时，传递进去的参数是数组的地址值
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 77};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }
        reverseArray(array);//传递进去的是数组的地址值
        System.out.println("\n=======================================");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }

    }

    public static void reverseArray(int[] list) {
        int max = list.length - 1;
        int min = 0;
        for (int i = 0; i < list.length; i++) {
            if (i >= (list.length - 1 - i))
                break;
            int temp = 0;
            temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }

    }
}
