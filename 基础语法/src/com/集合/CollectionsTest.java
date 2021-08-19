package com.集合;

import java.util.*;

/**
 * java.util.Collection 集合接口
 * java.util.Collections 集合工具类, 方便集合的操作
 */
public class CollectionsTest {
    public static void main(String[] args) {
        // ArrayList非线程安全
        List<String> list = new ArrayList<>();
        // 变成线程安全
        Collections.synchronizedList(list);

        // 排序
        list.add("a");
        list.add("abc");
        list.add("bc");
        list.add("aa");
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s);
        }

        List<Tortoise> tortoises = new ArrayList<>();
        tortoises.add(new Tortoise(3));
        tortoises.add(new Tortoise(300));
        tortoises.add(new Tortoise(31));
        // 对List集合元素排序,需要保证List集合中的元素实现Comparable接口
        Collections.sort(tortoises);
        for (Tortoise tortoise :
                tortoises) {
            System.out.println(tortoise);
        }

        // 对Set集合进行排序
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("king1");
        set.add("kin2g");
        set.add("3king");
        // 将set集合转化为list集合
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for (String s : myList){
            System.out.println(s);
        }

        // 另外一种排序方式 Collections.sort(list集合, 比较器对象)
    }
}

class Tortoise implements Comparable<Tortoise>{
    private int age;

    public Tortoise() {
    }

    public Tortoise(int age) {
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

    @Override
    public int compareTo(Tortoise o) {
        return this.age-o.age;
    }
}