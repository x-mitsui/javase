package com.oop.访问权限.other;

import com.oop.访问权限.User;

public class Test02 {
    public static void main(String[] args) {
        User user = new User();
        //System.out.println(user.weight);//同包private
        //System.out.println(user.height);//不同包默认
        //System.out.println(user.name);//不同包protected
        System.out.println(user.age);
    }
}
