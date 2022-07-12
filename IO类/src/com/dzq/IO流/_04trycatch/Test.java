package com.dzq.IO流._04trycatch;

import java.io.*;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 13:42
 * @Description: com.dzq.IO流.FileReaderWriter实现复制
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        File inFile = new File("demo.txt");
        File outFile = new File("demo2.txt");

        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(inFile);
            fw = new FileWriter(outFile);
            char[] ch = new char[5];
            String writeStr;
            int len;
            while((len = fr.read(ch))!=-1){
                writeStr = new String(ch,0,len);
                fw.write(writeStr);
            };
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw!=null){
                    fw.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr!=null){
                    fr.close();// 不能和fw.close()写在一起，因为需要保证流关闭
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
