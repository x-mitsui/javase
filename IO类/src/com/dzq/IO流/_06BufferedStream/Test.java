package com.dzq.IO流._06BufferedStream;

import java.io.*;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/12 - 07 - 12 - 15:24
 * @Description: com.dzq.IO流._06BufferedStream
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //1.有一个源图片
        File f1 = new File("./pic.png");
        //2.有一个目标图片：
        File f2 = new File("./pic2.png");
        //3.有一个输入的管道 怼 到 源文件：
        FileInputStream fis = new FileInputStream(f1);
        //4.有一个输出的管道 怼到  目标文件上：
        FileOutputStream fos = new FileOutputStream(f2);
        //5.功能加强，在FileInputStream外面套一个管：BufferedInputStream:
        BufferedInputStream bis = new BufferedInputStream(fis);
        //6.功能加强，在FileOutputStream外面套一个管：BufferedOutputStream:
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //7.开始动作 ：
        byte[] b = new byte[1024*6];//
        int len = bis.read(b);
        while(len!=-1){
            bos.write(b,0,len);
            /* bos.flush(); 底层已经帮我们做了刷新缓冲区的操作，不用我们手动完成：底层调用flushBuffer()*/
            len = bis.read(b);
        }
        //8.关闭流：
        //倒着关：
        //如果处理流包裹着节点流的话，那么其实只要关闭高级流（处理流），那么里面的字节流也会随之被关闭。
        bos.close();
        bis.close();
        /*fos.close();
        fis.close();*/
    }
}
