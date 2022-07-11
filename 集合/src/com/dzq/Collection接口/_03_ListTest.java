package com.dzq.Collection接口;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/11 - 07 - 11 - 09:38
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class _03_ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add(true);
        list.add(false);
        list.add(5L);
        list.add(6);

        // 增
        list.add(3,4);

        System.out.println(list);
        System.out.println("=================");

        // 删
        list.remove(0);
        list.remove(false);
        System.out.println(list);

        // 改
        list.set(0,"111");
        System.out.println(list);
        System.out.println("=================");

        // 查
        System.out.println(list.get(3));
        System.out.println(list.get(list.size() - 1));
//        System.out.println(list.get(4));// 越界
        System.out.println("---------------------");
        // 支持普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
        // 增强for循环
        for(Object o :list){
            System.out.println(o);
        }
        System.out.println("---------------------");
        // iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
