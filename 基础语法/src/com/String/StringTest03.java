package com.String;

/**
 * 下面程序一共创建了 几个对象
 */
public class StringTest03 {
    public static void main(String[] args) {
        /**
         * 方法区常量池中有一个"hello"
         * 堆内存中有两个对象.
         * 共3个
         */
        String s1 = new String("hello");
        String s2 = new String("hello");
    }
}
