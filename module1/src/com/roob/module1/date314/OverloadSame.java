package com.roob.module1.date314;

public class OverloadSame {
    public static void main(String[] args) {
        System.out.println(isSame((byte)1, (byte)2));
        System.out.println(isSame((short)128, (short)128));
        System.out.println(isSame(777, 888));
        System.out.println(isSame(9999L, 9999L));
    }

    public static boolean isSame(byte x, byte y) {
        System.out.println("byte");
        return x == y;
    }

    public static boolean isSame(short x, short y) {
        System.out.println("short");
        return x == y;
    }

    public static boolean isSame(int x, int y) {
        System.out.println("int");
        return x == y;
    }

    public static boolean isSame(long x, long y) {
        System.out.println("long");
        return x == y;
    }
}
