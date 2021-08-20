package com.IO流;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File的listFiles方法
 */
public class FileTest03 {
    public static void main(String[] args) {
        // 创建一个File对象
        File f1 = new File("/Users/mac/Documents/study/java/基础语法/res");
        // 获取当前目录下所有的子文件
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

    }
}
