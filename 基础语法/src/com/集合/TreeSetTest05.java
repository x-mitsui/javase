package com.集合;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet集合中元素可排序的第二种方式: 使用比较器的方式
 *
 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        // 创建集合对象
        // Set<Customer> customers = new TreeSet<>();//这样没有通过构造方法传递比较器进去
        Set<Turtle> turtles = new TreeSet<>(new TurtleComparator());// 给构造方法传递一个比较器

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

class Turtle {
    private int age;

    public Turtle() {
    }

    public Turtle(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Turtle{" +
                "age=" + age +
                '}';
    }
}

// 单独编写比较器
// 比较器实现java.util.Comparator接口.(Comparable是java.lang包下的, Comparator是java.util包下的)
class TurtleComparator implements Comparator<Turtle> {
    @Override
    public int compare(Turtle o1, Turtle o2) {
        return o1.getAge() - o2.getAge();
    }
}

