package com.roob.module1.date328;

import java.util.Objects;

public class Demo01Objects {
    public static void main(String[] args) {
        method(null);

    }

    public static void method(Object obj) {
        Objects.requireNonNull(obj, "空指针异常");
    }
}

//源码:

//    public static <T> T requireNonNull(T obj, String message) {
//        if (obj == null)
//            throw new NullPointerException(message);
//        return obj;
//    }