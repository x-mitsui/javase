package com.x_mitsui.array;

public class P52 {
    public static void main(String[] args) {
        int[] nums;//声明:名nums在栈中,

        nums = new int[10];//创建数组, 在堆中开辟空间, nums存储堆空间地址

        nums[3] = nums.length + 5;//给数组元素赋值

//        System.out.println(nums[10]);// 访问越界

        /*
         * 数组三种初始化状态
         * */

        //静态初始化 (大括号字面量)
        int[] a = {1, 2, 3, 4, 4, 5, 5};

        //动态初始化
        int[] b = new int[5];//默认值为0
        System.out.println(b[1]);
        System.out.println(b[2]);

        /***
         * 数组特点
         * 一旦创建长度确定,一旦创建大小不可改变
         * 元素必须是相同类型
         * 数组元素可以是任何类型,包括基本类型和引用类型
         * 数组变量属于引用类型,数组的每一个元素相当于该对象的成员变量
         * 数组本身就是对象,Java的对象在堆中,因此数组保存原始类型还是其它类型,数组对象都存在于堆中.
         */

    }

}
