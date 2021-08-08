package com.x_mitsui.array;

//import java.util.Arrays;

import java.util.Arrays;

public class P58_bubbling {
    public static void main(String[] args) {
        int[] arr = {9, 4, 5, 6, 8, 3, 2, 7, 10, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {9, 4, 5, 6, 8, 3, 2, 7, 10, 1};
        sort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
    }

    // 冒泡排序
    public static void sort2(int[] arr) {
        int temp = 0;
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
