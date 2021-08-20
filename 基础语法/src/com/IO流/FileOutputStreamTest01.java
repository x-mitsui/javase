package com.IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输出流, 负责写
 * 从内存到硬盘
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {

            // fos = new FileOutputStream("res/FileOutputStreamTest01");// 这种方式谨慎使用, 这种方式会将源文件清空, 然后重新写入
             fos = new FileOutputStream("res/FileOutputStreamTest01",true);// 以追加的方式在文件末尾写入
            // 开始写
            byte[] bytes = {97, 98, 99 ,100};
            // 将byte数组全部写出
            fos.write(bytes);
            // 将byte数组一部分写出
            fos.write(bytes, 2,2);

            //将字符串转换为byte数组
            String str = "我是中国人, 我骄傲";
            byte[] bs = str.getBytes();
            fos.write(bs);
            // 写完之后要刷新
            fos.flush();;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
