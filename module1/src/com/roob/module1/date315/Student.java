package com.roob.module1.date315;

/*
 * 类包含两组成部分：
 * 这里以一个学生举例
 * 属性：
 *     姓名    年龄       String   int
 * 行为：
 *     吃饭    睡觉    学习      public void sleep（）
 *
 * */
public class Student {
    //成员变量，在类当中，方法外部
    String name;
    int age;
    private boolean male;
//对于基本类型中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx的规则不变
    public void setMale(boolean male) {
        this.male = male;//通过谁调用的方法，谁就是this
    }

    public boolean isMale() {
        return male;
    }

    //成员方法，不要写static
    public void eat() {
        System.out.println("吃饭了");
    }

    public void sleep() {
        System.out.println("睡觉了");
    }

    public void study() {
        System.out.println("学习学习，用头学习");
    }
}
