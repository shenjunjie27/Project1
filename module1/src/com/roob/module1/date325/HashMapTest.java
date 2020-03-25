package com.roob.module1.date325;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Student, String> map = new LinkedHashMap<>();
        //多态 创建Map 引用 指向一个HashMap对象
        map.put(new Student("张天宇", 18), "上海");
        map.put(new Student("张建国", 19), "北京");
        map.put(new Student("徐晨", 22), "南京");
        map.put(new Student("Grace", 24), "香港");
        map.put(new Student("Will", 23), "巴黎");

        //取出元素，键找值方式
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.toString() + "........" + value);
        }
    }
}
