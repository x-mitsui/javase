package com.oop.访问权限;


public class Son01 extends User{
    public static void main(String[] args) {
        Son01 son01 = new Son01();
        //System.out.println(son01.weight);//同包继承private
        System.out.println(son01.height);//同包继承默认
        System.out.println(son01.name);
        System.out.println(son01.age);
    }
}
