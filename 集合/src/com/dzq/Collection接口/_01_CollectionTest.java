package com.dzq.Collection接口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/11 - 07 - 11 - 08:38
 * @Description: 测试Collection接口的增删改，利用实现类ArrayList
 * @version: 1.0
 */
public class _01_CollectionTest {
    public static void main(String[] args) {
        Collection col1 = new ArrayList();
        col1.add(1);
        col1.add(2);
        col1.add(3);
        System.out.println(col1);
        List ints = Arrays.asList(new Integer[]{6, 7, 8, 9});
        boolean b = col1.addAll(ints);
        System.out.println(col1);
        boolean isRemove = col1.remove(6);
        System.out.println("是否删除了？---"+isRemove);
        System.out.println(col1);
        System.out.println("----------------------------------------");

        System.out.println("清空");
        col1.clear();
        System.out.println(col1);

        System.out.println("是否包含4："+col1.contains(4));

        Collection col2 = new ArrayList();
        col2.add(1);
        col2.add(2);
        col2.add(3);

        Collection col3 = new ArrayList();
        col3.add(1);
        col3.add(2);
        col3.add(3);

        System.out.println("col2和col3是否相同："+col2.equals(col3));
    }
}
