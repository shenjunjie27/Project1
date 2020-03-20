package com.roob.module1.date320;

import java.util.Calendar;

//Calendar类为抽象类，创建对象时并非直接创建,而是通过静态方法创建,返回子类对象
public class Calendar1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日");
    }


}
