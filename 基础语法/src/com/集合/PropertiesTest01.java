package com.集合;


import java.util.Properties;

/**
 * Properties是一个Map集合, 继承Hashtable, Properties的key和value都是String对象,
 * 被称为属性类对象
 * 是线程安全的

 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        // 创建一个Properties对象
        Properties pro = new Properties();
        // 需要掌握Properties两个方法:一个存,一个取
        pro.setProperty("url", "jdbc:mysql://localhost:3306/x_mitsui");
        pro.setProperty("driver", "com.mysql.jdbc.Driver");
        pro.setProperty("username", "root");
        pro.setProperty("password", "123");

        // 通过key取value, 多行选定: alt+下拉鼠标
        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
