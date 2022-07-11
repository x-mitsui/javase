package com.dzq.test;

import java.util.ArrayList;
import java.util.Collection;

/**
* @Auther: x_mitsui
* @Date: 2022/7/11 - 07 - 11 - 12:23
* @Description: com.dzq.test
* @version: 1.0
*/public class _01_GenericTest {
    public static void main(String[] args) {
        // 泛型必须是引用数据类型
        Collection<String> col = new ArrayList<>();
        col.add("Hello");
        col.add("World");
        for (String o:col){
            System.out.println(o);
        }
    }
}
