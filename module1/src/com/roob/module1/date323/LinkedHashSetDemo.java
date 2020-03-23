package com.roob.module1.date323;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


//LinkedHashSet与HashSet的区别在于，LinkedHashSet是有顺序的
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();//多态创建一个Set的引用指向LinkedHashSet对象
        set.add("bbb");//添加元素
        set.add("aaa");
        set.add("abc");
        set.add("bbc");
        set.add("aaa");//这个应该是添加不进去的
        Iterator<String> it = set.iterator();//迭代器遍历
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
