package com.集合;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection的contains方法
boolean contains(Object o);
    判断集合中是否包含某个对象o
    如果包含返回true, 如果不包含返回false
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(new String("abc"));
        c.add(new String("abc"));
        c.add("abc");
        c.add("abc");
        c.add("xyz");
        c.add("xyz");
        String x = new String("abc");

        System.out.println(c.size());
        System.out.println(c.contains(x));//contains内部调用了equals
    }
}
