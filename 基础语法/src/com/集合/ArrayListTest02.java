package com.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*
集合ArrayList的构造方法
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        // 默认初始化容量10
        List myList1 = new ArrayList();
        // 指定初始化容量100
        List myList2 = new ArrayList(100);

        Collection c = new HashSet();
        c.add(190);
        c.add(19);
        c.add(10);
        // 通过这个构造方法就可以将HashSet集合转换成List集合
        List myList3 = new ArrayList(c);

        for (int i = 0; i < myList3.size(); i++) {
            System.out.println(myList3.get(3));
        }


    }
}
