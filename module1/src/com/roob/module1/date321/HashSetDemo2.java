package com.roob.module1.date321;

import java.util.HashSet;
import java.util.Iterator;

//Set接口
// 1.不允许存储重复的元素
//2.没有索引,所以不能是用普通的for循环遍历,迭代器遍历应该是可以的
//哈希表是一个无序结构,并且是不同步的
//哈希表速度非常快
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<Student>();
        Student student = new Student("于谦", 43);
        studentHashSet.add(student);
        studentHashSet.add(new Student("郭德纲", 44));
        studentHashSet.add(new Student("于谦", 43));
        studentHashSet.add(new Student("郭麒麟", 23));
        studentHashSet.add(student);

        for (Student student2 : studentHashSet) {//增强型for循环遍历
            System.out.println(student2);
        }

//        Iterator<Student> it= studentHashSet.iterator();//迭代器遍历
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        System.out.println(studentHashSet);

    }
}
