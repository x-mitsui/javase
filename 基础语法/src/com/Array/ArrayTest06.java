package com.Array;

/**
 * 二维数组: 每一个元素是一个一维数组
 * */
public class ArrayTest06 {
    // 数组中存储的每个元素是'引用'
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 3, 4,},{1}};//里面是2个一维数组
        System.out.println(arr.length);//2
        System.out.println(arr[0].length);//5
        int[] arr2={100,200,300};
        System.out.println(arr2.length);//3

        int[] a0 = arr[0];
        arr[0][0] =111;
        int a00 = arr[0][0];
        System.out.println(a00);
    }

}


