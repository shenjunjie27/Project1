package com.roob.module1.date315;


/*
 * 类并不能直接使用，需要根据类创建一个对象，才能使用
 * 1.导包
 * import com.roob.modlule1.date315.Student;
 * 对于和当前类在同一个包的情况下，可以省略导包语句不写
 * 2.创建
 * 类名称 对象名 = new 类名称（）；
 * Student stu = new Student();
 * 3.使用，分为两种情况
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名（参数）
 * */
public class Demo02Student {
    //这里可以省略导包语句
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        stu.name="Jack";
        stu.age=21;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
        stu.sleep();
        stu.study();
    }

}
