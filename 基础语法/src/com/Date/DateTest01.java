package com.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 如何获取系统时间
 * Date如何转化成String
 * String如何转化成Date
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception{
        // 获取系统当前时间(精确到毫秒的系统当前时间)
        // 直接调用无参数构造方法

        Date nowTime = new Date();
        // java.util.Date类的toString()方法已经被重写
        // 输出的应该不是一个对象的内存地址, 应该是一个日期字符串
        System.out.println(nowTime);// Sun Aug 15 15:39:57 CST 2021

        // 日期格式化
        /**
         * yyyy
         * MM
         * dd 日
         * HH
         * mm 分
         * ss 秒
         * SSS 毫秒
         * 在日期格式中,除了 y M d H m s这些字符不能随便写之外, 剩下的符号格式自己随意组织
         */
        // SimpleDateFormat是java.txt包下的, 专门负责格式化
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
        String nowTimeStr = s.format(nowTime);
        System.out.println(nowTimeStr);

        // String如何转化成Date类型
        String time = "2008-08-08 08:08:08 888";
//        SimpleDateFormat s1 = new SimpleDateFormat("格式不能随便写, 要和日期字符串格式相同");
        // 如果不同,会出现异常java.text.ParseException
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
        Date dateTime = s1.parse(time);
        System.out.println(dateTime);
    }
}
