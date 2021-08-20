package com.IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter:
 *  文件字符输出流, 只能输出普通文本.
 *  读取文本内容时, 比较方便, 快捷.
 *  注意word不是普通文本
 */
public class FileWriterTest {
    public static void main(String[] args) {
        // 创建文件字符输入流
        FileWriter writer = null;

        try {
            writer = new FileWriter("res/FileWriterTest");//也可以用追加方式
            String str = "我爱你中国";
            char[] chars = {'你','是','什','m','人'};
            writer.write(str);
            writer.write("\n");
            writer.write(chars);
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
