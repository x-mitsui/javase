package com.集合;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet集合:
 *  无序不可重复:
 *  1. 存储时顺序和去除的顺序不同
 *  2. 不可重复
 *  3. 放到HashSet集合中的元素实际上是放到HashMap集合的key部分了
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        // 演示以下HashSet集合特点
        Set<String> strs = new HashSet<>();

        strs.add("Hello");
        strs.add("world");
        strs.add("!");
        strs.add("Are");
        strs.add("You");
        strs.add("OK");
        strs.add("?");

        //遍历
        for (String s :
                strs) {
            System.out.println(s);
        }
    }
}
