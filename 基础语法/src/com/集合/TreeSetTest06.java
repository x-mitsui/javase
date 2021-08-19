package com.集合;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet集合中元素可排序的第二种方式: 使用比较器的方式(匿名内部类写法)
 *  最终结论:
 *      放到TreeSet或者TreeMap集合key部分的元素要想做到排序,有两种方式:
 *      1. 放在集合中的元素实现java.lang.Comparable接口
 *      2. 在构造器TreeSet或者TreeMap集合的时候给它传一个比较器对象
 *  那如何选择?
 *      当比较规则不会发生改变的时候, 或者说当比较规则只有1个的时候, 建议实现Comparable接口(String Integer比较规则不变,所以使用这个)
 *      如果比较规则有多个, 并且需要多个比较规则之前频繁切换, 建议使用Comparator接口
 *
 *      Comparator接口的设计复合OCP原则
 */
public class TreeSetTest06 {
    public static void main(String[] args) {
        // 创建集合对象
        Set<Turtle> turtles = new TreeSet<>(new Comparator<Turtle>() {
            @Override
            public int compare(Turtle o1, Turtle o2) {
                return o1.getAge() - o2.getAge();
            }
        });// 匿名内部类写法(这个类没有名字, 直接new接口)

        // 添加元素
        turtles.add(new Turtle(132));
        turtles.add(new Turtle(532));
        turtles.add(new Turtle(32));
        turtles.add(new Turtle(2));
        //遍历, 从小到大自动排序
        for (Turtle turtle : turtles) {
            // 按照字典顺序自动排序
            System.out.println(turtle);
        }
    }
}



