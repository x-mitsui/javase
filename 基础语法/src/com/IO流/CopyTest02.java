package com.IO流;

import java.io.*;

/**
 * 使用FileReader和FileWriter进行拷贝的话, 只能拷贝"普通文本"文件
 */
public class CopyTest02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("res/CopyTest01");
            out = new FileWriter("res/CopyTest02");

            // 一边读一边写
            char[] chars = new char[1024*512];//一次最多拷贝1MB (char是两个字节)
            int readCount = 0;
            while((readCount = in.read(chars))!=-1){
                out.write(chars,0, readCount);
            }

            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开try, 一起try的时候, 其中一个异常, 可能会影响另一个关闭
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
