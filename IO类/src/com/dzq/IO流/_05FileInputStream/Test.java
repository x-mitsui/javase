package com.dzq.IO流._05FileInputStream;

import java.io.*;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 14:39
 * @Description: com.dzq.IO流._05FileInputStream
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("./pic.png"));
        FileOutputStream fos = new FileOutputStream(new File("./pic_copy.png"));

        int len;
        byte[] bytes = new byte[1024*6];
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
