package com.roob.module1.date315.demo03;

public class Demo01Array {
    public static void main(String[] args) {
        //创建一个长度为3的数组,存放对象
        Person []array=new Person[3];
        Person one = new Person("马尔扎哈",38);
        Person two = new Person("寒冰射手",27);
        Person three = new Person("麦林炮手",16);

        array[0]=one;
        array[1]=two;
        array[2]=three;

        for (int i = 0; i < array.length; i++) {
            System.out.println("名字是: "+array[i].getName()+" 年龄是: "+array[i].getAge());
        }
    }


}
