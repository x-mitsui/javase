package com.dzq.file;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 09:37
 * @Description: com.dzq.file
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 将文件封装为一个File类的对象
        File file = new File("/Users/mac/Downloads/data.txt");
        System.out.println("文件是否可读:"+file.canRead());
        System.out.println("文件是否可写:"+file.canWrite());
        System.out.println("文件上级目录:"+file.getParent());
        System.out.println("文件名:"+file.getName());
        System.out.println("文件是否为文件:"+file.isFile());
        System.out.println("文件是否为目录:"+file.isDirectory());
        System.out.println("文件是否隐藏:"+file.isHidden());
        System.out.println("文件大小:"+file.length());// 单位：字节
        System.out.println("文件是否存在:"+file.exists());
//        if(file.exists()){
//            file.delete();
//        }else {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        File file2 = new File("/Users/mac/Downloads/data.txt");
        System.out.println(file2==file);// false
        System.out.println(file2.equals(file));// 路径是否相同

        // 相对和绝对路径
        File f6 = new File("testIO1.txt");
        if(!f6.exists()){
            try {
                f6.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("relative path:"+f6.getPath());
        System.out.println("absolute path:"+f6.getAbsolutePath());


    }
}
