package com.Array;

/**
 * Array:
 * 1. 引用数据类型
 * 2. 容器,可以容纳多个元素;
 * 3. 可存储基本数据类型数据,也可以存储引用数据类型的数据
 * 4. 数组因为是引用数据类型, 所以数组对象是堆内存当中的.
 * 5. 数组当中如果存储的是java对象的话, 实际上存储的是java对象的引用
 * 6. 数组一旦创建, 在java中规定, 长度不可变.
 * 7. 数组分为一维数组,二维数组,三维数组,多维数组
 * 8. 所有数组对象都有length属性(java自带)
 * 9. java数组要求数组中元素统一.
 * 10. 数组在内存中存储的每一个元素内存地址连续
 * 11. 数组中首元素的内存地址作为整个数组对象的内存地址
 * 12. 数组下标
 * ***************************************************
 * 优点:
 * 1. 每一个元素的内存地址在空间上是连续的
 * 2. 每一个元素的类型相同,所以占用空间大小相同
 * 3. 知道第一个元素内存地址, 知道每一个元素占用的空间的大小,又知道下标,所以可以快速计算出某一个下标上元素的地址,通过地址定位元素,查找效率高
 *  数组中存1个或100万个元素,理论上查找效率相同,因为数组查找元素不会一个个找,而是通过数学表达式计算出来的(算出内存地址,直接定位)
 * 缺点:
 * 1. 由于未来保证数组中每个元素的内存地址连续, 所以在数组上随机删除或者增加元素的时候,效率较低, 因为随机增删元素会涉及到元素统一向前或向后移
 * 动的情况
 * 2. 数组不能存储大数据, 因为很难在内存空间上找到一块特别大的连续的内存空间.
 * 注意: 对于数组最后一个元素的增删是没有效率影响的.
 * */
public class ArrayTest01 {
    public static void main(String[] args) {
        // 声明
        int[] arr0;
        double[] arr1;
        boolean[] arr2;
        String[] arr3;
        Object[] arr4;

        //初始化
        int[] arr5 = {1, 2, 3};
        int[] arr6 = new int[3];//初始化一个3个长度int类型的数组,每个元素默认值0
        String[] arr7 = new String[5];//初始化一个5个长度String类型的数组,每个元素默认值null

        int[] nums = {1,2,3,4,5,6,7};
        int[] arrays = {1,2,2,3,4};
        //打印
        for(int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }

        printArray(nums);

        printArray(reverse(nums));

        //二维数组
        int[][] arr_2 = {{12,2},{1},{3}};

        String[] str = {"123","223"};
        printArray(str);
        printArray(new String[]{"12","12"});//静态
        printArray(new int[3]);//动态
        //函数传参

    }
    //打印int数组
    public static void printArray(int[] arr){
        //JDK1.5 for-each循环
        System.out.println("打印=================");
        for (int item:arr) {
            System.out.println(item);
        }
    }
    //打印String数组
    public static void printArray(String[] arr){
        //JDK1.5 for-each循环
        System.out.println("打印=================");
        for (String item:arr) {
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
