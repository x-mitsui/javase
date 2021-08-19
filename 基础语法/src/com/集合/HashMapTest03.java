package com.集合;

import com.集合.bean.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * HashMap集合key部分允许null吗? 允许
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();

        // HashMap允许key为null
        map.put(null, null);
        System.out.println(map.size());

        //key
        map.put(null, 100);
        System.out.println(map.size());

        //key为null
        System.out.println(map.get(null));

    }
}
