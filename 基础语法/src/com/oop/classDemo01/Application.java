package com.oop.classDemo01;

public class Application {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.println();
        t.set_age(16);
        System.out.println(t.get_age());

        t.useTest();
    }
}
