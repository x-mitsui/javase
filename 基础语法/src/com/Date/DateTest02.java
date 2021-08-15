package com.Date;

/**
 * 获取自1970年1月1日 00:00:00到当前系统时间的总毫秒数,1970年第一台计算机诞生
 * 简单总结下System类
 * System.out [out是System类的静态变量]
 * System.out.println() [println()方法不是System类的, 是PrintStream类的方法
 * System.gc() 建议启动垃圾回收
 * System.currentTimeMillis() 获取自1970年1月1日 00:00:00到当前系统时间的总毫秒数
 * System.exit(0) 退出JVM
 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);// 1629014631217

        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费"+(end-begin)+"毫秒");//耗费67毫秒

        long begin2 = System.currentTimeMillis();
        recycle();
        long end2 = System.currentTimeMillis();
        System.out.println("无打印循环1亿次方法耗费"+(end2-begin2)+"毫秒");//无打印循环1亿次方法耗费7毫秒
    }

    // 统计一个方法耗时
    public static void print(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = "+i);//打印占去了大部分时间
        }
    }

    public static void recycle(){
        for (int i = 0; i < 100000000; i++) {
        }
    }
}
