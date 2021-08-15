package com.Enum;

/**
 * 枚举: 一枚一枚可以列举出来的, 才建议使用枚举
 * 枚举编译之后也是生成class文件
 * 枚举也是一种引用数据类型
 * 枚举中每一个值都可以看成一种常量
 *
 */

public class EnumTest02 {
    public static void main(String[] args) {
        divide(100,0);
        divide(100,3);
    }

    public static Result divide(int a, int b){
        try{
            int c = a/b;
            return Result.SUCCESS;
        } catch (Exception e){
            return Result.FAIL;
        }
    }
}

enum Result{
    SUCCESS, FAIL,
}