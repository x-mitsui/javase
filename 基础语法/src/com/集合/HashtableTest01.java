package com.集合;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Hashtable集合key或value部分允许null吗? 不允许
 *
 * Hashtable方法都带有synchronized: 线程安全的
 * 线程安全有其它的方案, 这个Hashtable对线程的处理导致效率较低, 使用较少了
 *
 * Hashtable和HashMap一样, 底层都是哈希表数据结构.
 * Hashtable的初始化容量是11, 默认加载因子是: 075
 * Hashtable的扩容是: 原容量 * 2 + 1
 */
public class HashtableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();

        // Hashtable不允许key为null
        map.put(null, 100);

        // Hashtable不允许value为null
        map.put(100, null);


    }
}
