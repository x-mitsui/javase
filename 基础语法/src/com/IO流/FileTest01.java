package com.IO流;

import java.io.File;
import java.io.IOException;

/**
 * File:
 *  1. File类和四大家族没有关系, 所以File类不能完成文件的读和写
 *  2. File对象代表什么?
 *      文件和目录路径名的抽象表现形式
 *      C:\Drivers 这是一个File对象
 *      C:\Drivers\Lan\Realtek\Readme.text 也是File对象
 *      一个File对象有可能对应的是目录, 也可能是文件
 *      File只是一个路径名的抽象表现形式
 */
public class FileTest01 {
    public static void main(String[] args) {
        // 创建一个File对象
        File f1 = new File("/Users/mac/Documents/study/java/基础语法/res");
        // 判断是否存在
        System.out.println(f1.exists());

        // 如果所查文件不存在, 则以文件的形式创建出来
//        if(!f1.exists()){
//            try {
//                f1.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        // 如果所查文件不存在, 则以文件夹的形式创建出来
//        if(!f1.exists()){
//            f1.mkdir();
//        }
        /*
        // 创建多重目录
        File f2 = new File("/Users/mac/Documents/study/java/基础语法/res/a/b/c");
        if(!f2.exists()){
            f2.mkdirs();
        }

         */

        File f3 = new File("/Users/mac/Documents/study/java/基础语法/res/a/b");
        // 获取文件的父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径:"+parentFile.getAbsolutePath());
    }
}
