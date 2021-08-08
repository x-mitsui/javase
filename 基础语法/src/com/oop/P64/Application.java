package com.oop.P64;

public class Application {
    public static void main(String[] args) {
        Person p = new Person();// 通过断点调试可以发现,使用new关键字本质上还是调用构造器
        System.out.println(p._name);
    }
}
