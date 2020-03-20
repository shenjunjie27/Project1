package com.roob.module1.date319;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimePratice {
    private static final int NUM = 86400000;

    public static void main(String[] args) throws ParseException {
        Date dateNow = new Date();
        long timeNow = dateNow.getTime();
        long day = timeNow / NUM;

        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        // 获取出生日期,键盘输入
        String birthdayString = new Scanner(System.in).next();
        // 将字符串日期,转成Date对象
        // 创建SimpleDateFormat对象,写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 调用方法parse,字符串转成日期对象

        Date birthdayDate = sdf.parse(birthdayString);
        long birthdaySecond = birthdayDate.getTime();
        long day2 = birthdaySecond / NUM;
        long result = day - day2;
        if (result < 0)
            System.out.println("还没出生");
        else {
            System.out.println("结果是" + result + "天");

        }
    }
}