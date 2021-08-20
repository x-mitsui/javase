package com.IO流;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File
 */
public class FileTest02 {
    public static void main(String[] args) {
        // 创建一个File对象
        File f1 = new File("/Users/mac/Documents/study/java/基础语法/res");
        // 获取文件名
        System.out.println(f1.getName());

        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());

        // 获取文件最后一次修改事件
        System.out.println(f1.lastModified());// 这个毫秒是从1970年到现在的总毫秒数

        Date time = new Date(f1.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss SSS");
        System.out.println(sdf.format(time));

        System.out.println(f1.length());// 获取文件的大小bytes
    }
}
