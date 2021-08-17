package com.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于集合遍历/迭代专题
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        // 注意: 以下遍历方式/迭代方式, 是所有Collection通用的一种方式
        // 在Map集合中不能用. 在所有的Collection以及子类中使用

        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        // 对集合Collection进行遍历/迭代
        // 第一步: 获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        // 第二步: 通过以上获取的迭代器对象开始迭代/遍历集合.
        /*
            Iterator中的方法:
            boolean hasNext()如果仍有元素可迭代, 则返回true
            Object next() 返回迭代的下一个元素; 这个方法让迭代器前进一位, 并且将指向的元素返回.

            注意: 迭代器it最初并没有指向第一个元素
         */
        while (it.hasNext()){
            // 不管当初存进去的是什么, 取出来的都是Object
            Object obj = it.next();
            System.out.println(obj);
        }


    }
}
