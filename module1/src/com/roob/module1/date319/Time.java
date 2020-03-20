package com.roob.module1.date319;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static void main(String[] args) throws ParseException {
        Date date = new Date(0L);
        Date date2 = new Date();
        System.out.println("初始的时间是:" + date);
        System.out.println("现在的时间是:" + date2);
        long timeLong = date2.getTime();//这个方法把日期对象转换成对应的毫秒值
        System.out.println(timeLong);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = df.format(date2);//将Date对象格式化为字符串
        System.out.println(str);
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str2 = "2020年3月20日";
        Date date3 = df2.parse(str2);
        System.out.println(date);
    }

}
