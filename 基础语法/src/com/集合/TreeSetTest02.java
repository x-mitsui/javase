package com.集合;

import java.util.Set;
import java.util.TreeSet;

/**
 * 1. TreeSet集合底层实际上是一个TreeMap集合
 * 2. TreeMap集合底层是一个二叉树
 * 3. 放到TreeSet集合中的元素, 等同于放到TreeMap集合key部分了.
 * 4. TreeSet集合中的元素: 无序不可重复, 但是可以按照元素的大小顺序自动排序.
 * 称为可排序集合.
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        // 创建集合对象
        Set<String> strs = new TreeSet<>();
        // 添加元素
        strs.add("zhangsan");
        strs.add("lisi");
        strs.add("wangwu");
        strs.add("wangliu");
        strs.add("zhangsi");
        //遍历, 从小到大自动排序
        for (String s : strs) {
            // 按照字典顺序自动排序
            System.out.println(s);
        }
    }
}

/*
假设数据库数据如下:
    userid   name   birth
    ----------------------
    1        zs     1990-03-03
    2        ls     1992-05-01
    3        zw     1997-03-02
    4        wl     2001-04-21
    编写程序从数据库当中取出数据, 在页面中展示用户信息的时候按照生日升序或降序排序
 */
