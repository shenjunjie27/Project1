package com.roob.module1.date320;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();


        coll.add("A");
        coll.add("B");
        coll.add("C");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);

            int arr[] = {1, 3, 5, 7, 9};
            for (int i : arr)
                System.out.println(i);
        }
        for (String s : coll)
            System.out.println(s);//集合也是可以遍历的
    }
}
