package com.dzq.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/11 - 07 - 11 - 09:16
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class _02_CollectionIteratorTest {
    public static void main(String[] args) {
        Collection col1 = new ArrayList();
        col1.add(1);
        col1.add(2);
        col1.add(3);
        col1.add("str");
        col1.add(false);

        // 增强遍历
        for (Object o:col1){
            System.out.println(o);
        }
        System.out.println("------------");
        // iterator
        Iterator iterator = col1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
