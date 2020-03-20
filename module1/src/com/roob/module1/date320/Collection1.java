package com.roob.module1.date320;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();

        coll.add("林娜琏");
        coll.add("金所炫");
        coll.add("裴秀智");
        System.out.println(coll);

        System.out.println(coll.contains("林娜琏"));
        System.out.println(coll.remove("裴秀智"));
        System.out.println(coll);
        System.out.println(coll.size());
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + " ");
            coll.clear();
            System.out.println(coll);
            System.out.println(coll.isEmpty());
        }
    }
}
