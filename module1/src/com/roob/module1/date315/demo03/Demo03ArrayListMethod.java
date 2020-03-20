package com.roob.module1.date315.demo03;

import java.util.ArrayList;

/*ArrayList中常用的方法有:
 *
 * public boolean add(E e) 返回值代表是否成功
 * public E get(int index),获取元素,参数是索引,返回值就是对应位置的元素
 *public E remove(int index), 删除元素
 * public int size()
 * */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);


        boolean sucess = list.add("林娜琏");
        System.out.println(list);
        System.out.println(sucess);
        list.add("金所炫");
        list.add("裴珠泫");
        list.add("裴秀智");
        list.add("朴宝英");

        System.out.println(list.get(0));
        System.out.println("=============");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        String flop=list.remove(2);
        System.out.println("============");
        System.out.println(list);
        System.out.println("是谁flop了呢？ "+flop);
    }
}
