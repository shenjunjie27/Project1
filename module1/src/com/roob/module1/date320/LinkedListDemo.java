package com.roob.module1.date320;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();//new 后面中括号里的String应该是可以省略的

        //添加元素 addFirst 插入开头
        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");
        System.out.println(link);

        //获取链表的第一个元素
        System.out.println(link.getFirst());
        //获取链表的第二个元素
        System.out.println(link.getLast());
        //删除第一个元素
        System.out.println("删除第一个元素,并且返回了这个被删除的元素");
        System.out.println(link.removeFirst());
        //删除最后一个元素
        System.out.println("删除最后一个元素,并且返回了这个被删除的元素");
        System.out.println(link.removeLast());

        while (!link.isEmpty()) {//link.isEmpty 链表为空时,返回true 条件即为 列表不为空
            System.out.println(link.pop());//弹出栈顶元素
        }//当列表为空时,退出循环
        //此时,列表为kong
        System.out.println(link);
    }
}
