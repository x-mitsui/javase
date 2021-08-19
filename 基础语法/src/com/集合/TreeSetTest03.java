package com.集合;

import java.util.Set;
import java.util.TreeSet;

/**
 * 对于自定义类型, TreeSet可以排序么
 *  以下程序中对于Person类来说, 无法排序. 因为没有指定Person对象之间的比较, 谁小谁大并没有说明
 *
 *  以下程序运行的时候出现了这个异常
 *      java.lang.ClassCastException
 *      com.集合.Person cannot be cast to java.lang.Comparable
 *  出现这个异常的原因
 *      Person类没有实现java.lang.Compareable接口
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        Person p2 = new Person(32);
        Person p3 = new Person(32);
        Person p4 = new Person(32);
        // 创建集合对象
        Set<Person> persons = new TreeSet<>();
        // 添加元素
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        //遍历, 从小到大自动排序
        for (Person p : persons) {
            // 按照字典顺序自动排序
            System.out.println(p);
        }
    }
}
class Person{
    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

