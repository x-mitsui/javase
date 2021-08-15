package com.Random;

import java.util.Arrays;
import java.util.Random;

/**
 * 编写程序,生成5个不重复的随机数[0-100],
 * 最终存储到数组中
 */
public class RandomTest02 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int index = 0;
        while (index < arr.length){
            Random random = new Random();
            int num = random.nextInt(101);//测试用[0-5]测试,bound设置为6
            if(!isIn(arr, num)){
                arr[index] = num;
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
    public static boolean isIn(int[] arr,int num){
        /**
         * 排序导致bug
        Arrays.sort(arr);

        return Arrays.binarySearch(arr,num) >= 0;

         */
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                return true;
            }
        }
        return false;

    }
}
