package com.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 对第一个程序改进
 * 这个程序仍有缺点:
 * 一次读取一个字节,这样内存和硬盘交互太频繁, 基本上时间/资源都耗费在交互上了,能不能一次读取多个字节
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        // 创建文件字节输入流对象
         FileInputStream fis = null;
        try {
        //   fis = new FileInputStream(System.getProperty("user.dir")+("\\FileInputStreamTest01"));
            fis = new FileInputStream(System.getProperty("user.dir")+("/res/FileInputStreamTest01"));
            // 读
            // 方法返回值是读取到字节本身
            /*
            while(true){
                int readData = fis.read();
                if(readData==-1){
                    break;
                }
                System.out.println(readData);
            }
            */
            //改造while循环
            int readData;
            while((readData =fis.read())!= -1){
                System.out.println(readData);
            }
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
