package com.roob.module1.date314;

/*
直接打印数组名称，得到内存地址哈希值
动态初始化，int元素默认值为0
浮点为0.0
字符类型'\u0000'
bool false
引用类型 默认为null
1.栈（stack）存放局部变量，方法运行在栈中
一旦超出作用域，局部变量从栈中消失
2.堆（heap）凡是new出来的东西，都在堆中
堆中存放地址值（16进制）
堆中的默认值
int 0
double 0.0
char 'u\0000'
boolean false
引用类型 null
3.方法区（Method Area）：存储.class，包含方法的信息
4.本地方法栈
5.寄存器
*/

public class ArrayUse {
    public static void main(String[] args) {
        int [] array={1,2,3};
        System.out.println(array);//[I@723279cf 是数组首位对应的地址（哈希值）
        System.out.println(array[0]);
        array[0]=100;
        System.out.println(array[0]);
    }

}
