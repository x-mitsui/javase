package com.dzq.test01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/9 - 07 - 09 - 10:57
 * @Description: com.dzq
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.toGMTString());
        System.out.println(d.toLocaleString());
        System.out.println(System.currentTimeMillis());
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Date d2=df.parse("2022/03/04 12:32:57");
            System.out.println(d2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(df.format(new Date()));
    }
}
