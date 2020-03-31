package com.roob.module1.date328;


//throws关键字,异常处理的第一种方式,交给别人处理
//throws关键字,把异常对象声明抛出给方法的调用者处理(自己不处理,最终交给JVM处理),中断

//必须写在方法声明处
//后面必须是Exception或者子类
//如果抛出多个异常对象,必须也声明多个异常
//子父类关系,直接声明父类异常


import java.io.FileNotFoundException;

public class Demo01Throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("d:\\a.txt");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递文件路径不对");//编译异常
        }
        System.out.println("路径没有问题,打印文件");
    }
}
