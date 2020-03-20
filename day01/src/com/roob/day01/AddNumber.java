package com.roob.day01;

/*addNumber方法被调用了三次
void方法只能被单独调用，其余两种调用不可执行*/
public class AddNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int d = addNumber(1, 3);//赋值调用
        System.out.println(addNumber(a, b));//打印调用
        addNumber(a, b);//单独调用
    }

    public static int addNumber(int x, int y) {
        System.out.println("The file has been opened");
        return (x + y);
    }

}
