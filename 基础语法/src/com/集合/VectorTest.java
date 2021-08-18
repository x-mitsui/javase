package com.集合;

import java.util.*;

/**
 * Vector:
 *  1. 底层也是一个数组
 *  2. 初始化容量:10
 *  3. 怎么扩容的?
 *      扩容之后是原容量的2倍
 *      10--->20--->40
 *  4. ArrayList扩容之后是原容量的1.5倍
 *  5. Vector中所有方法都是线程同步的, 都带有synchronized关键字, 效率较低, 使用较少
 *  6. 怎么将一个线程不安全的ArrayList转化为线程安全的
 *      使用集合工具类:
 *          java.util.Collections
 *      注意:
 *          java.util.Collection是集合接口
 */
public class VectorTest {
    public static void main(String[] args) {
//        Vector v = new Vector();
        List v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);

        // 扩容之后容量是20
        v.add(11);

        Iterator it = v.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        // 这个可能会用
        List myList = new ArrayList();// 非线程安全

        // 转化为线程安全
        Collections.synchronizedList(myList);
        myList.add("111");
        myList.add("222");
        myList.add("333");
    }
}
