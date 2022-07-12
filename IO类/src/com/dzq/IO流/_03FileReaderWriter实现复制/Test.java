package com.dzq.IO流._03FileReaderWriter实现复制;

import java.io.*;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 13:42
 * @Description: com.dzq.IO流.FileReaderWriter实现复制
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File inFile = new File("demo.txt");
        File outFile = new File("demo2.txt");

        FileReader fr = new FileReader(inFile);
        FileWriter fw = new FileWriter(outFile);

        char[] ch = new char[5];
        String writeStr;
        int len;
        while((len = fr.read(ch))!=-1){
            writeStr = new String(ch,0,len);
            fw.write(writeStr);
        };

        fw.close();
        fr.close();
    }
}
