package com.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用FileInputStream和FileOutputStream来完成文件的拷贝
 * 拷贝的过程应该是一边读, 一边写
 * 使用以上的字节流拷贝文件的时候, 文件类型随意, 万能的, 什么样的文件都能拷贝
 */
public class CopyTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("res/CopyTest01");
            fos = new FileOutputStream("res/CopyTest02");

//            byte[] readBytes = new byte[fis.available()];
//            fis.read(readBytes);
//            fos.write(readBytes);
            // 一边读一边写
            byte[] readBytes = new byte[1024*1204];//一次最多拷贝1MB
            int readCount = 0;
            while((readCount = fis.read(readBytes))!=-1){
                fos.write(readBytes,0, readCount);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开try, 一起try的时候, 其中一个异常, 可能会影响另一个关闭
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
