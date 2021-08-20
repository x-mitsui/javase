package com.IO流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader
 *      带有缓冲区的字符输入流
 *      使用这个流的时候不需要自定义char数组, 或者说不需要定义byte数组, 自带缓存
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            FileReader reader = new FileReader("res/BufferedReaderTest01.java");
            // 当一个流的构造方法需要一个流的时候, 这个被传进来的流叫做节点流(这里是reader)
            // 外部负责包装的这个流,叫做包装流,或者叫处理流(这里是bufferedReader)
            bufferedReader = new BufferedReader(reader);

            // 注意 bufferedReader.readLine()读取不带换行符
            /*
            // 读
            String firstLine = bufferedReader.readLine();
            System.out.println(firstLine);
            String secondLine = bufferedReader.readLine();
            System.out.println(secondLine);
            String thirdLine = bufferedReader.readLine();
            System.out.println(thirdLine);
             */
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
