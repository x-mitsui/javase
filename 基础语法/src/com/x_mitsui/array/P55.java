package com.x_mitsui.array;

public class P55 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] arrays = {1,2,2,3,4};
        //打印
        for(int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }

        printArray(nums);

        printArray(reverse(nums));

    }
    //打印数组
    public static void printArray(int[] arr){
        //JDK1.5 for-each循环
        System.out.println("打印=================");
        for (int item:arr) {
            System.out.println(item);
        }
    }
    //反转数组
    public static int[] reverse(int[] arr){
        System.out.println("反转=================");
        int[] result = new int[arr.length];
        for (int i=0,j=result.length-1;i< arr.length;i++,j--){
            result[j]=arr[i];
        }
        return result;
    }
}
