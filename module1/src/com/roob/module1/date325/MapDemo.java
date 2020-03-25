package com.roob.module1.date325;

import java.util.HashMap;

/**
 * `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
 * `public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
 * `public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。
 * `boolean containsKey(Object key)  ` 判断集合中是否包含指定的键。
 * `public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
 * `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //创建 map对象
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        System.out.println(map);
        //添加元素到集合

        //String remove（String key）
        System.out.println(map.remove("邓超"));
        System.out.println(map);

        //想要查看 黄晓明的媳妇 是谁
        System.out.println(map.get("黄晓明"));
        System.out.println(map.get("邓超"));
    }
}
