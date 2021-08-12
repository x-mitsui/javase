package com.oop.访问权限.other;

import com.oop.访问权限.User;

public class Son02 extends User {
    public static void main(String[] args) {
        Son02 son02 = new Son02();
        //System.out.println(son02.weight);//不同包继承private
        //System.out.println(son02.height);//不同包继承默认
        System.out.println(son02.name);
        System.out.println(son02.age);
    }
}
