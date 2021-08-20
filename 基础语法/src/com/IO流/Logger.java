package com.IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    日志工具
 */
public class Logger {
    public static void log(String msg){
        try {
            PrintStream out = new PrintStream(new FileOutputStream("res/outstreamlogger.txt",true));//追加方式
            // 改变输出方向
            System.setOut(out);
            // 当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);

            System.out.println(strTime +": "+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
