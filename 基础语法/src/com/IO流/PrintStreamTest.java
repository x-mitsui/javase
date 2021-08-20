package com.IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * java.io.PrintStream: 标准的字节输出流,默认输出到控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) {


        PrintStream ps= System.out;
        ps.println("123");
        ps.println("123");
        ps.println("123");

        // 联合写
        System.out.println("hello world");

        // 标准输出流不需要手动close()关闭

        // 可以改变标准输出流的输出方向么? 可以
        try {
            // 标准输出流不再指向控制台,而指向"Log"文件
            PrintStream printStream = new PrintStream(new FileOutputStream("res/PrintStreamTestLog"));
            System.setOut(printStream);
            printStream.println("Hello World");
            printStream.println("你好呀");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 测试工具类
        Logger.log("调用了logger方法,~~~~~~~~~");
    }
}
