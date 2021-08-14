package com.String;

public class StringTest04 {
    public static void main(String[] args) {
        // 创建字符串最常用方式
        String str1 = "hello World";
        System.out.println(str1);
        // 其它常用方法
        /**
         * String s = "";
         * String s = new String("");
         * String s = new String(byte数组);
         * String s = new String(byte数组,起始下标,长度);
         * String s = new String(char数组);
         * String s = new String(char数组,起始下标,长度);
         */
        // 将byte数组全部转化成字符串
        byte[] bytes = {97, 98, 99};
        String s2 = new String(bytes);
        /**
         * 输出一个引用的时候,会自动调用toString方法, 默认Object的话,会自动输出对象的内存地址
         * 通过输出结果我们可以得出结论:String类已经重写了toString方法
         * 输出的字符串对象的话,输出的不是对象的内存地址,而是字符串本身
         */
        System.out.println(s2);

        // 将byte数组中的一部分转换成字符串
        String s3 = new String(bytes, 1,2);
        System.out.println(s3);

        // 将char数组全部转化成字符串
        char[] chars = {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);
        // 将char数组一部分转化成字符串
        String s5 = new String(chars, 2, 3);
        System.out.println(s5);

        String s6 = new String("hello world");
        System.out.println(s6);
    }
}
