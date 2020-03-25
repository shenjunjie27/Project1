package com.roob.module1.date325;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        //创建Map集合对象
        HashMap<String, String> map = new HashMap<>();
        //添加元素
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        //获取所有的 entry 对象
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        //遍历得到每一个entry对象
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "的CP是：" + value);
        }
        //Map集合不能直接使用迭代器或者for each进行遍历。但是转成
        //Set自会后就可以使用如上的遍历方法


    }
}
