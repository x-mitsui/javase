package com.集合;

public class ForEachTest01 {
    public static void main(String[] args) {
        // int 类型数组
        int[] arr = {43,23,45,6,7,1};
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------->");
        // 增强for循环
        // Item是数组中的每一个元素
        // 缺点: 没下标
        for (int Item : arr) {
            System.out.println(Item);
        }
    }
}
