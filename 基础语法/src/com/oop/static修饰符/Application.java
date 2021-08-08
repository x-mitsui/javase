package com.oop.static修饰符;

public class Application {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("观察静态代码块执行次数---->");
        Person p2 = new Person();
    }
}
