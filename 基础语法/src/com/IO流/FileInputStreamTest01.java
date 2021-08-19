package com.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.FileInputStream:
 *  1. 文件字节输入流, 万能的, 任何类型的文件都可以采用这个输入流来读
 *  2. 字节的方式, 完成输入的操作, 完成读的操作(硬盘---->内存)
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        // 创建文件字节输入流对象
         FileInputStream fis = null;
        try {
        //   fis = new FileInputStream(System.getProperty("user.dir")+("\\FileInputStreamTest01"));
            fis = new FileInputStream(System.getProperty("user.dir")+("/res/FileInputStreamTest01"));
            // 读
            // 方法返回值是读取到字节本身
            int readData = fis.read();
            System.out.println(readData);//97
            readData = fis.read();
            System.out.println(readData);//98
            readData = fis.read();
            System.out.println(readData);//99
            readData = fis.read();
            System.out.println(readData);//100
            readData = fis.read();
            System.out.println(readData);//101
            readData = fis.read();
            System.out.println(readData);//102

            // 没有数据了
            readData = fis.read();
            System.out.println(readData);//-1
            readData = fis.read();
            System.out.println(readData);//-1
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            // 关闭流的前提是: 流不是空, 流是空的时候没必要关闭
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
