package com.roob.module1.date315.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Demo02ArrayListStudent {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("林娜琏", 22);
        Student two = new Student("金所炫", 19);
        Student three = new Student("裴秀智", 23);
        Student four = new Student("朴宝英", 28);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getAge());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list2.add(num);

        }
        printArrayList(list2);
    }

    public static void printArrayList(ArrayList list) {
        System.out.print("{");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + "@");
        }
        System.out.println(list.get(list.size()-1)+"}");

    }
}
