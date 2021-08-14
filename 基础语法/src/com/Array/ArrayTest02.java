package com.Array;

/**
 * main方法"String[] args"有什么用?
 * JVM调用main方法,会自动传一个String数组过来
 * */
public class ArrayTest02 {
    // 程序员负责写, JVM负责调用
    public static void main(String[] args) {
        // JVM默认传递过来的这个数组对象的长度为0
        // 其实这个数组是留个用户的, 用户可以在控制台输入参数, 这个参数自动被转换为"String[] args"
        // 例如这样的程序:java ArrayTest02 abc def xyz
        // 那么这个时候JVM会自动将"abc def xyz"通过空格的方式进行分离, 分离完之后, 自动放到"String args[]"数组中
        // 所以main方法上面的String[] args数组主要是用来接收用户输入参数的
        // 把abc def xyz转换成字符串数组: {"abc", "def", "xyz}
        System.out.println(args.length);

    }

}
