package com.集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 * Set<K> keySet()  获取Map集合所有的key(所有的键是Set集合)
 */
public class MapTest02 {
    public static void main(String[] args) {
        // 第一种方式: 获取所有的key, 通过遍历key, 来获取value
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "zhaowu");
        map.put(4, "wangliu");

        // 遍历Map
        // 获取所有的key, 所有的key是一个set集合
        Set<Integer> keys = map.keySet();
        // 第一种方式: 遍历key, 通过key获取value

        // 迭代器可以
        System.out.println("迭代器方式------>");
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("foreach方式------>");
        //foreach也可以
        for (Integer key : keys) {
            System.out.println(key+"="+map.get(key));
        }

        System.out.println("=======================");
        // 第二种方式: Set<Map.Entry<K,V>>	entrySet()
        // 此方法是把Map集合全部转化为Set集合
        // Set集合中元素的类型是:Map.Entry
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        while(it2.hasNext()){
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key+"="+value);
        }
        
        // foreach
        // 这种方式效率较高, 因为获取key和value都是直接从node对象中获取属性值
        // 这种方式比较适合大数据量
        for (Map.Entry<Integer, String> node: set) {
            System.out.println(node.getKey()+"="+node.getValue());
        }

    }
}
