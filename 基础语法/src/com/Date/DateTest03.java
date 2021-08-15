package com.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) throws Exception{
        //1970年1月1日 08:00:00 001(东八区)
        Date time22 = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
        String str = sdf.format(time22);
        System.out.println("时:"+str);

        // 获取昨天此时的时间
        Date time = new Date(System.currentTimeMillis() - 1000*60*60*24);
        System.out.println(sdf.format(time));
    }
}
