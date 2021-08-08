package com.x_mitsui.method;

public class P46 {

    public static void main(String[] args) {
        int sum = add(3, 4);//ahh和b是ide的智能提示,并非语法
        System.out.println(sum);
    }

    /* 方法定义
       public static是修饰符,可选
     */
    public static int add(int ahh, int b) {
        return ahh + b;
    }


}
