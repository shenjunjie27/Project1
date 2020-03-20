package com.roob.module1.date320;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("abc");
        coll.add("itcast");
//        coll.add(3.1415926);
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str.length());
        }
    }
}
