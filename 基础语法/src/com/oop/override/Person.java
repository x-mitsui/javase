package com.oop.override;

public class Person {
    private int _age;
    private float _weight;

    // 非静态方法
    public void overrideFunc(){
        System.out.println("父类非静态方法");
    }

    // 静态方法
    public static void test(){
        System.out.println("父类静态方法");
    }

}
