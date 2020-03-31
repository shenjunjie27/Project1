package com.roob.module1.date328;

/*
     java.lang.Throwable 是Java语言中所有错误或异常的超类
     Exception 编译期异常
     RuntimeException 运行期异常
     Error
         癌症
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {//可能会出现异常的代码
            date = sdf.parse("1999-09-09");
        } catch (ParseException e) {
            //异常的处理逻辑
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续");
    }
}
