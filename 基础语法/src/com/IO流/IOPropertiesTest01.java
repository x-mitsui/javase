package com.IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 以后经常改变的数据, 可以单独写到一个文件里,使用程序动态获取,将来只需要改变文件的内容,代码不需要改动,程序也不需要重新编译
 *
 * 类似于以上机制的这种文件被称为配置文件
 * 并且配置文件的内容格式为
 * key1=value
 * key2=value
 * 被称为属性配置文件
 * java规范中建议以".properties"结尾,但不是必须的
 * 这种以.properties结尾的文件在java中被称为属性配置文件
 * 其中Properties是专门存放属性配置文件内容的一个类
 */
public class IOPropertiesTest01 {
    public static void main(String[] args) {
        /*
        Properties是一个Map集合, key和value都是String类型.
        想将"res/IOPropertiesTest01.properties"文件中的数据加载到Properties对象中
         */
        // 新建输入流对象, 将硬盘数据("res/IOPropertiesTest01.properties")存入内存(Properties对象)
        FileReader reader=null;
        try {
            reader = new FileReader("res/IOPropertiesTest01.properties");
            // 新建Map集合
            Properties pro =  new Properties();

            // 调用Properties对象的load方法将文件中的数据加载到Map集合中
            pro.load(reader); // 文件中的数据顺着管道加载到Map集合里,其中等号左边为key, 右边为value
            // 如何通过key来获取value呢
            String username=pro.getProperty("username");
            System.out.println(username);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
