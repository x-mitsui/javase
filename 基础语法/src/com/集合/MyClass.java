package com.集合;

import java.util.HashSet;
import java.util.Set;

public class MyClass {
    // 声明一个静态内部类
    private static class InnerClass{
        //静态方法
        public static void m1_func(){
            System.out.println("静态内部类的m1方法执行");
        }

        //实例方法
        public void m2_func(){
            System.out.println("静态内部类实例方法执行");
        }
    }

    public static void main(String[] args) {
        // 类名叫做MyClass.InnerClass
        MyClass.InnerClass.m1_func();

        MyClass.InnerClass m2 = new MyClass.InnerClass();
        m2.m2_func();

        // 给一个Set集合
        // 该Set集合中存储的对象是: MyClass.InnerClass 类型
        Set<MyClass.InnerClass> set = new HashSet<>();

        Set<String> set2 = new HashSet<>();

        Set<MyMap.MyEntry<Integer,String>> set3 = new HashSet<>();
    }
}

class MyMap{
    public static class MyEntry<K,V>{

    }
}