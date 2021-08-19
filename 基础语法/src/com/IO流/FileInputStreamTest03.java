package com.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 对第二个程序改进
 * 1. 注意相对路径的使用
 * 2. int read(byte[] b)
 *      一次最多读取b.length个字节
 *      减少硬盘和内存的交互, 提高程序的执行效率
 *      往byte[]数组中读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        // 创建文件字节输入流对象
         FileInputStream fis = null;
        try {
            // 相对路径一定是从当前所在的位置作为起点开始找
            // IDEA默认的当前路径是哪里? 工程Project的根就是IDEA的默认当前路径
            fis = new FileInputStream("res/FileInputStreamTest01");

            byte[] byteArr = new byte[5];
            int readCount = fis.read(byteArr);
            System.out.println("读取了"+readCount+"个字节");// readCount为读取到的字节数量为5
            for (byte item:
                 byteArr) {
                System.out.println(item);
            }
            System.out.println(new String(byteArr, 0, readCount));// 读取多少合成多少
            System.out.println("第二次----------->");
            readCount = fis.read(byteArr);// 第二次只能读取3个字节
            System.out.println("读取了"+readCount+"个字节");
            for (byte item:
                    byteArr) {
                System.out.println(item);
            }
            System.out.println(new String(byteArr, 0, readCount));
            System.out.println("第三次----------->");
            readCount = fis.read(byteArr);// 第三次读不到返回-1, 会替换前三个
            System.out.println("读取了"+readCount+"个字节");
            for (byte item:
                    byteArr) {
                System.out.println(item);
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
