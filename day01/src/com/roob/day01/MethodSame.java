package com.roob.day01;

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(1, 2));//false
        System.out.println(isSame(10, 10));//true
    }

    public static boolean isSame(int x, int y) {
      /*  if (x == y)
            return true;
        else return false;*/
        return x == y;
    }
}
