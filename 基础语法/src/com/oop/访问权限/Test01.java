package com.oop.访问权限;

public class Test01 {
    public static void main(String[] args) {
        User user = new User();
        //System.out.println(user.weight);//同包私有
        System.out.println(user.height);
        System.out.println(user.name);
        System.out.println(user.age);
    }
}
