package com.roob.day01;

public class Test {
    public static void main(String[] args) {

        ninenineXtable();

    }

    public static int ninenineXtable() {
        int i, j, k;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                k = i * j;
                System.out.print(i + "*" + j + "=" + k + "\t");
            }
            System.out.print("\n");
        }
        return 0;

    }
}
