package com.集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 自定义泛型
 *  自定义泛型的时候, <> 尖括号中的是一个标识符, 随便写
 *  java源代码中经常出现的是
 *      <E>--element首字母,
 *      <T>--type首字母
 */
public class GenericTest03<随便写的标识符> {
    public static void main(String[] args) {
        GenericTest03<String> GT3 = new GenericTest03<>();
//        GT3.doSome(123);// 不匹配
        GT3.doSome("123");

        GenericTest03<Integer> GT2 = new GenericTest03<>();
        GT2.doSome(123);
    }
    public void doSome(随便写的标识符 o){
        System.out.println(o);
    }
}





