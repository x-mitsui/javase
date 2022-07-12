package com.dzq.IO流._02FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 13:31
 * @Description: com.dzq.IO流.FileWriter
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        FileWriter fw = new FileWriter(file,true);// 参数二：开始写入时，追加内容
        String str= "你好 中国";
//        char[] chars = str.toCharArray();
        fw.write(str);
        fw.close();
    }
}
