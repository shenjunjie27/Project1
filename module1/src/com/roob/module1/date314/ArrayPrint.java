package com.roob.module1.date314;

/*
遍历数组指的是对数组当中每一个元素进行逐一挨个的处理
默认的处理方式是打印输出
*/
public class ArrayPrint {
    public static void main(String[] args) {
        double[] list = new double[]{1, 1, 3, 4, 725.777, 6, 6, 7, 8, 9, 9, 7, 5, 3};
        double max = list[0];
        // for (double i : list)//增强型for循环
        for (int i = 0; i < list.length; i++) {
            if (max < list[i])
                max = list[i];
        }
      /*  {
            if (max < list[i])
                max = list[i];
        }*/
        System.out.println("The max value is " + max);
    }
}
