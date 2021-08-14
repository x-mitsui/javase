package com.Array;

//import java.util.Arrays;

import java.util.Arrays;

public class Bubbling {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    //选排法
    public static void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++)
                if (arr[i] > arr[j]) {// 交换这一步还能优化,可以在一轮中确定了最小再交换
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
    }

    // 冒泡排序
    public static void sort2(int[] arr) {
        int temp = 0;
        /** 外倒序,内正序也可以,是一种妙招
         * for(int i =arr.length-1;i>0;i--){
         *  for(int j = 0; j < i; j++){
         *
         *  }
         * }
         * */
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false; //减少无意义的排序
            for(int j = 0; j < arr.length-1-i; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
