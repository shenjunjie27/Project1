package com.roob.module1.date320;


/* Iterator<String> it = coll.iterator();//迭代器
        while (it.hasNext()) {
        String s = it.next();
        System.out.println(s);
        }*/

import java.util.HashSet;
import java.util.Iterator;

//以上是迭代器的一个例子
//HashSet集合中不存储重复的元素
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();//创建一个Set集合,set指向这个新对象
        //添加元素
        set.add(new String("cba"));//这不是多此一举吗
        set.add("abd");//对啊,直接这么弄不就完事了
        set.add("bac");
        set.add("cba");
        //增强型for循环,遍历
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("====================");
        //迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        while (set.iterator().hasNext()) {
//            System.out.println(set.iterator().next());
//        }
        //此方法不可取,会出现无限循环
    }
}
