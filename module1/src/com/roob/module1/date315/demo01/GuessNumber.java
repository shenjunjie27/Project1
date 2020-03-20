package com.roob.module1.date315.demo01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        guess_number();
    }

    public static void guess_number() {
        Random r = new Random();
        int n = r.nextInt(101);
       /* srand((int)time(0));//设置随机数种子
        int n=rand()%100;//产生一个0-100的随机数*/
        int m = 101;
        int i = 0;
        while (m != n) {
            i++;
            if (i > 10)
                break;
            //cout<<"Please guess the number. The number is between 0 to 100."<<endl;
            System.out.println("Please guess the number. The number is between 0 to 100. You have ten chances.");
            System.out.println("It is your "+i+" try.");
            //cin>>m;
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            m = num;
            if (m > 100 | m < 0) {
                System.out.println("The number you have entered is not in [0,100],Please enter a new number");
                Scanner sc2 = new Scanner(System.in);
                int num2 = sc.nextInt();
                m = num2;
            }
            if (m > n) {
                //cout<<"The number is too large."<<endl;
                System.out.println("The number is too large.");
            } else if (m < n) {
                //cout<<"The number is too small."<<endl;
                System.out.println("The number is too small.");
            } else {
                //cout<<"The number you have guessed is right."<<endl;
                System.out.println("The number you have guessed is correct!!!");
            }
        }
        System.out.println("Game Over!!!");
    }

}
