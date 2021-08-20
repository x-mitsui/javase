package com.IO流;

import java.io.*;

/**
 * BufferedReader: 带有缓冲的字符输入流(二)
 *
 */
public class BufferedReaderTest02 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            // 字节流
            FileInputStream fis = new FileInputStream("res/BufferedReaderTest01.java");
            // 通过转换流转换(InputStreamReader将字节流转化为字符流)
            // 此处fis是节点流, reader是包装流
            InputStreamReader isr =  new InputStreamReader(fis);

            // BufferedReader(只能传字符流参数)
            // 此处reader是节点流, bufferedReader是包装流
            bufferedReader = new BufferedReader(isr);

            // 注意 bufferedReader.readLine()读取不带换行符
            // 循环读
            String line = "";
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader!=null){
                try {
                    // 对于包装流来说, 只需要关闭最外层流就行, 里面的节点流会自动关闭(因为方法内部调用了节点流的关闭)
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
