package com.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream类的其它常用方法
 *  int available(): 返回流当中剩余的没有读到的字节数量
 *  Long skip(long n): 跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        // 创建文件字节输入流对象
         FileInputStream fis = null;
        try {
            fis = new FileInputStream("res/FileInputStreamTest01");

            // int readByte = fis.read();
            // System.out.println("还剩多少字节没读:"+fis.available());

            // 妙用, 不需要循环, 直接读一次就行了
//            byte[] readBytes = new byte[fis.available()];//不适合大文件, 因为byte数组不能太大
//            int readCount = fis.read(readBytes);
//            System.out.println(new String(readBytes));

            // skip
            fis.skip(3);
            System.out.println(fis.read());


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
