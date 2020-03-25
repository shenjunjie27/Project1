package com.roob.module1.date325;

import java.util.HashMap;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建Map集合对象
        HashMap<String, String> map = new HashMap<>();
        //添加元素
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");
        //获取键的集合
        Set<String> keys = map.keySet();
        //遍历键集得到每一个键
        for (String key : keys) {
            String value = map.get(key);//获取key对应的值
            System.out.println(key + "对应的值是" + value);
        }
    }
}
