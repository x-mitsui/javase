package com.集合;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection接口中常用的方法
 * 1. Collection中能存放什么元素?
 *  没有使用"泛型"之前,Collection中可以存储Object的所有子类型.
 *  使用了"泛型"之后, Collection中只能存储某个具体的类型.
 *  (注意: 集合中不能直接存储基本数据类型, 也不能存储java对象, 只是存储java对象的内存地址.)
 * 2. Collection中的常用方法
 *      boolean add(Object e); 向集合中添加元素
 *      int size(); 获取集合中元素的个数
 *      void clear(); 清空集合
 *      bool contains(Object e); 判断集合中是否包含元素e
 *      remove(Object e);
 *      isEmpty(); 判断集合元素个数是否为0
 *      Object[] toArray() 集合转数组(使用不多)
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        // Collation c = new Collection();//接口是抽象的, 无法实例化
        Collection collation = new ArrayList();

        collation.add(1200);//自动装箱,实际上是放进去了一个对象的内存地址
        collation.add(3.14);
        collation.add(new Object());
        collation.add(new Student());
        collation.add(true);

        //
        System.out.println("集合中元素的个数:"+collation.size());

        //
        collation.clear();
        System.out.println("集合中元素的个数:"+collation.size());
        collation.add("nice");// "nice"对象的内存地址放到了集合
        collation.add(1);
        System.out.println("集合中元素的个数:"+collation.size());

        System.out.println(collation.contains("nice"));
        System.out.println(collation.contains(1));

        collation.remove(1);
        System.out.println(collation.size());

        System.out.println(collation.isEmpty());
        collation.clear();
        System.out.println(collation.isEmpty());

        collation.add("vv");
        collation.add(234);
        collation.add(true);
        collation.add("哈哈哈哈");
        collation.add(new Student());

        Object[] objs = collation.toArray(); //注意: objs存的是对象地址
        for (int i = 0; i < objs.length; i++) {
            Object obj = objs[i];
            System.out.println(obj);
        }

    }
}

class Student{

}
