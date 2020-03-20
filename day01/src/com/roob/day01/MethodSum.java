package com.roob.day01;

public class MethodSum {
    public static void main(String[] args) {
        int p = sum(1, 100);
        System.out.println(p);

    }

    public static int sum(int x, int y) {//0<x<y
        if (x < 0 | y < 0)
            return -1;
        if (y <= x)
            return -2;
        int result = 0;
        for (int i = x; i <= y; i++) {
            result += i;

        }
        return result;
    }
}
