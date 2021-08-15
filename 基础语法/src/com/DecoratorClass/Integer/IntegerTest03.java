package com.DecoratorClass.Integer;


public class IntegerTest03 {
    public static void main(String[] args) {
        // 通过包装类的常量,来获取最大值和最小值
        Integer i = Integer.MAX_VALUE;
        byte b = Byte.MIN_VALUE;

        System.out.println(i);
        System.out.println(b);

    }
}
