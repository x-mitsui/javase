package com.dzq.file;

import java.io.File;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 10:18
 * @Description: com.dzq.file
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        File file = new File("a/b/c");// 此为相对路径，先对谁，可通过getAbsolutePath查看
        file.mkdirs();//mkdir为创建单级目录，mkdirs为多级目录。
        System.out.println(file.getAbsolutePath());

//        file.delete();//只会删除c目录，而且前提c目录为空

        // 查看
        File file2 = new File("./");// 查看当前目录的文件和文件夹
        String[] list = file2.list();
        for(String n:list){
            System.out.println(n);
        }
    }
}
