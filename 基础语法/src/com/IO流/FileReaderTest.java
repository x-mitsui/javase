package com.IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader:
 *  文件字符输入流, 只能读取普通文本.
 *  读取文本内容时, 比较方便, 快捷.
 */
public class FileReaderTest {
    public static void main(String[] args) {
        // 创建文件字符输入流
        FileReader reader = null;

        try {
            reader = new FileReader("res/FileReaderTest");
            /*
            // 开始读
            char[] chars = new char[10]; //一次读取10个[字符]
            int readCount = 0;
            while ((readCount = reader.read(chars))!=-1){
                System.out.println(new String(chars,0,readCount));
            }
             */
            // 准备一个char数组
            char[] chars = new char[4];
            // 往char数组中读
            reader.read(chars);
            for (char c:chars) {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
