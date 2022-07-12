package com.dzq.IO流._01FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 11:04
 * @Description: com.dzq.IO流
 * @version: 1.0
 */
public class TestIO02 {
    public static void main(String[] args) throws IOException {
        File f = new File("a/b/c/testio1.txt");
        FileReader fileReader = new FileReader(f);

        // 一次读取多个
//        char[] ch = new char[5];
//        int len ;
//        while ((len=fileReader.read(ch))!=-1){
//            for (int i = 0; i < len; i++) {
//                System.out.println(ch[i]);
//            }
//        }

        // 方式二：收纳进String对象
        char[] ch = new char[5];
        int len ;
        while ((len=fileReader.read(ch))!=-1){
            String str = new String(ch,0,len);
            System.out.print(str);
        }


        fileReader.close();
    }
}
