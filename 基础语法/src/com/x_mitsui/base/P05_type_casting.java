package com.x_mitsui.base;

public class P05_type_casting {
    // 类型转换
    // 由于Java是强类型语言,所以要进行某些运算的时候,需要用到类型转换
    // 由低到高分别是 byte,short,char -> int -> long ->float ->double
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;//由高到低需要强制类型转换,会造成内存溢出

        System.out.println(i);
        System.out.println(b);

        int s = 456;
        double m = s; // 自动类型转换
        System.out.println(s);

        System.out.println((int)23.7);// 精度损失
        System.out.println((int)-45.89f);// 精度损失
        /*
        * 注意点:
        * 1. 不能对布尔类型转换(它存储容量为位)
        * 2. 不能把对象类型转换为不相关的类型
        * 3. 在高容量转换到低容量的时候, 强制转换
        * 4. 转换的时候可能存在内存溢出, 或者精度问题
        * */

        char c = 'a';
        int d = c + 1;
        System.out.println(d);
        System.out.println((char)d);

        // 操作比较大的数时,注意溢出问题
        // JDK7新特性, 数字之间可以用下划线
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years; // -1474836480
        long total2 = money * years; // 默认是int.转换之前已经存在内存问题了

        long total3 = (long)money * years; // 先将一个数转为long

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);

    }

}
