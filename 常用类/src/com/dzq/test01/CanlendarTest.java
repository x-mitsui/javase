package com.dzq.test01;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/9 - 07 - 09 - 11:43
 * @Description: com.dzq.test01
 * @version: 1.0
 */
public class CanlendarTest {
    public CanlendarTest() {
    }

    public static void main(String[] args) {
        Calendar ca2 = new GregorianCalendar();
        Calendar ca = Calendar.getInstance();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要显示的日期");
//        String str = sc.next();

//        java.sql.Date date = java.sql.Date.valueOf(str);

//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
        System.out.println(Math.ceil(10));
        Math.random();


        LocalDateTime ldt01 = LocalDateTime.now();
        System.out.println(ldt01);
        LocalDateTime ldt02 = LocalDateTime.of(2022, 12, 12, 2, 50, 50);
        System.out.println(ldt02);
    }
}
