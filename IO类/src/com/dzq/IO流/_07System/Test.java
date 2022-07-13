package com.dzq.IO流._07System;

import java.io.*;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 18:06
 * @Description: com.dzq.IO流._07System
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        char[] ch= new char[3];
        int len ;

        File f = new File("键盘输入的内容.txt");
        FileOutputStream fw = new FileOutputStream(f);
        OutputStreamWriter osw = new OutputStreamWriter(fw);
        BufferedWriter bw = new BufferedWriter(osw);

        int times = 3;
        while((len= br.read(ch))!=-1) {
            bw.write(ch,0,len);
            times--;
            System.out.println("timers:"+times);
            if(times==0){
                System.out.println("break");
                break;
            }
        };
        bw.close();
        br.close();



    }
}
