package com.roob.module1.date325;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String str = new Scanner(System.in).nextLine();
        findChar(str);
    }

    public static void findChar(String str) {
        //首先创建一个集合 存储字符以及出现的次数
        HashMap<Character, Integer> map = new HashMap<>();
        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer count = map.get(c);
                map.put(c, ++count);
            }
        }
        System.out.println(map);
    }
}
