package com.Enum;

/**
 * 分析以下程序在设计方面有什么缺陷?
 * divide返回值类型返回一个int不恰当,
 * 既然最后结果只有成功和失败, 最好使用布尔类型. 因为布尔类型正好可以表示两种状态
 *
 */
public class EnumTest01 {
    public static void main(String[] args) {

    }

    // 原始需求: 如果异常就返回0, 成功就返回1
    public static int divide(int a, int b){
        try{
            int c = a/b;
            return 10;//如果手误返回10, 实际上已结出错,但编译器没有检测出来.原则上错误发现越早越好.
        } catch (Exception e){
            return 0;//0表示失败
        }
    }
}

/**
 * 布尔类型的局限在于只能表示两种情况
 */