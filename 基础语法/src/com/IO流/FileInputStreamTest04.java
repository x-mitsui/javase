package com.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 对第三个程序改进
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        // 创建文件字节输入流对象
         FileInputStream fis = null;
        try {
            fis = new FileInputStream("res/FileInputStreamTest01");

            byte[] byteArr = new byte[5];
            int readCount = 0;
            String totalStr = "";
            while((readCount = fis.read(byteArr))!=-1){
                totalStr += new String(byteArr, 0, readCount);
            }
            System.out.println("读取的字符串为:"+totalStr);
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
