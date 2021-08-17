package com.集合;

import java.util.*;

/**
 * 测试list接口中的常用方法
 *  1. List集合存储元素特点: 有序可重复
 *      有序:List集合元素有下标
 *      从0开始, 以1递增
 *      可重复: 存储1个1,还可以再存储1
 *  2. List既然是Collection接口的子接口, 那么肯定List还有自己的特有方法:
 *      add(int index, Object element);
 *      Object	get(int index)
 *      int	indexOf(Object o)
 *      int	lastIndexOf(Object o)
 *      boolean	remove(Object o)
 *      Object	set(int index, E element)
 */
public class ListTest01 {
    public static void main(String[] args) {
        // List myList = new LinkedList();
        // List myList = new Vector();
        List myList = new ArrayList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");
        // 在列表指定位置插入指定元素(使用不多,对于ArrayList集合来说效率比较低)
        myList.add(1,"King");

        Iterator it = myList.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("====================");
        // 根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);

        // 因为有下标,所以List集合有自己比较特殊的遍历方式
        // 通过下标遍历,[List集合特有方式,Set没有]
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        // 获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("King"));
        System.out.println(myList.lastIndexOf("C"));

        System.out.println("删除指定下标位置的元素====================");
        // 删除指定下标位置的元素
        myList.remove(myList.size()-1);
        System.out.println(myList.size());
        System.out.println("改指定位置的元素====================");
        // 改指定位置的元素
        myList.set(2, "Soft");
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }
    }
}
