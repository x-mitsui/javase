package com.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 关于集合遍历/迭代专题(二)
 */
public class CollectionTest03 {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(100);
        c.add(3);
        Iterator it = c.iterator();

        while (it.hasNext()){
            // 不管当初存进去的是什么, 取出来的都是Object
            Object obj = it.next();
            if(obj instanceof  Integer){
                System.out.println("Integer");
            }
            System.out.println(obj);
        }
        System.out.println("--------------");


        // 无序不可重复
        // 存取顺序不同
        Collection c2 = new HashSet();
        c2.add(33);
        c2.add(101);
        c2.add(102);
        c2.add(100);
        c2.add(100);
        c2.add(25);
        c2.add(1010);
        c2.add(1);
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            // 不管当初存进去的是什么, 取出来的都是Object
            Object obj = it2.next();
            System.out.println(obj);
        }
    }
}
