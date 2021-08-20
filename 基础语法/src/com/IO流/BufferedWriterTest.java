package com.IO流;

import java.io.*;

/**
 * BufferedWriter: 带有缓冲的字符输出流
 * OutputStreamWriter: 转换流
 */
public class BufferedWriterTest {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        try {
//            bufferedWriter = new BufferedWriter(new FileWriter("res/FileWriterTest"));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("res/FileWriterTest")));

            bufferedWriter.write("我爱你中国");
            bufferedWriter.write("\n");
            bufferedWriter.write("我爱你中国");
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedWriter != null){
                try {
                    // 对于包装流来说, 只需要关闭最外层流就行, 里面的节点流会自动关闭(因为方法内部调用了节点流的关闭)
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
