package com.dzq.IO流._01FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 11:04
 * @Description: com.dzq.IO流
 * @version: 1.0
 */
public class TestIO01 {
    public static void main(String[] args) throws IOException {
        File f = new File("a/b/c/testio1.txt");
        FileReader fileReader = new FileReader(f);
        // 方式一：一个字符一个字符读，文件结尾data为-1
//        int data1 = fileReader.read();
//        int data2 = fileReader.read();
//        int data3 = fileReader.read();
//        int data4 = fileReader.read();
//        int data5 = fileReader.read();
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);
//        System.out.println(data4);
//        System.out.println(data5);

        // 简化：
        int data;
        while((data=fileReader.read())!=-1){
            System.out.println((char)data);
        }

        fileReader.close();
    }
}
