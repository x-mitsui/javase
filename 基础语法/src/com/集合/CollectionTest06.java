package com.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于集合元素的remove
 * 1. 当集合的结构发生改变时, 迭代器必须重新获取, 如果还用老的迭代器会出现异常
 *
 * 2. 在迭代集合元素的过程中, 不能调用集合对象的remove方法, 会出现异常
 *
 * 3. 在迭代元素的过程当中, 一定要使用迭代器的remove
 */
public class CollectionTest06 {
    public static void main(String[] args) {

        // 创建迭代器
        Collection c = new ArrayList();
        // 注意: 此时获取的迭代器, 指向的是那时集合中没有元素状态下的迭代器
        // 一定要注意: 集合结构只要发生改变, 迭代器必须重新获取
        // 当集合结构发生了改变, 迭代器没有重新获取时, 调用next()方法时, java.util.ConcurrentModificationException
        Iterator it = c.iterator();

        c.add(1);
        c.add(3);
        c.add(2);

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("==================");

        Collection c2 = new ArrayList();
        Iterator it2 = c2.iterator();

        c2.add(1);
        c2.add(3);
        c2.add(2);

        while (it2.hasNext()){
            Object obj2 = it2.next();

            // 删除元素之后, 集合的结构发生了变化, 应该重新区获取迭代器
            // 但是循环下一次的时候并没有重新获取迭代器, 所以会出现异常java.util.ConcurrentModificationException
            // c2.remove(obj2);// 直接通过集合删除元素, 没有通知迭代器,(导致迭代器的快照和原集合状态不同)

            // 应该使用迭代器来删除
            it2.remove();// 删除的一定是迭代器指向的当前元素
            System.out.println(obj2);
        }

    }
}
