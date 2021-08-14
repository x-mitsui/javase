package com.Array;

/**
 * 数组扩容:
 * 先新建一个大的数组.然后将小容量数组中的数据一个一个的拷贝到大数组当中
 * 所以尽量在初始化的时候估算出数组大小,避免扩容
 * */
public class ArrayTest05 {
    // 数组中存储的每个元素是'引用'
    public static void main(String[] args) {

        int[] src = {1,2,3,3,4,};
        int[] dest = new int[20];
        System.arraycopy(src,1,dest,0,3);

        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }


        String[] strs = {"1", "2", "3"};
        String[] newStrs = new String[20];
        // 这里拷贝的是地址,不是对象
        System.arraycopy(strs, 0, newStrs, 0, strs.length);
    }

}


