package reflect;

import reflect.bean.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 验证反射机制的灵活性
 *  java代码写一遍, 在不改变java源代码的基础上, 可以做到通过配置文件进行不同对象的实例化, 肥肠灵活!
 *  复合OCP开闭原则, 对扩展开发, 对修改关闭
 *
 * 后期的高级框架, ssh ssm Spring SpringMVC MyBatis Spring Struts Hibernate 底层都采用了反射机制
 * 学会了反射机制有利于剖析源代码
 *
 */
public class ReflectTest03 {
    public static void main(String[] args) {
        // 这种代码就写死了, 只能创建一个User类型的对象
        // User user = new User();

        // 以下代码是灵活的, 代码不需要改动, 可以修改配置文件, 配置文件修改之后, 可以创建不同的实例对象
        // 通IO流读取classinfo.properties文件
        FileReader reader = null;
        try {
             reader = new FileReader("Lesson/src/classinfo.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String classname = properties.getProperty("className");
        // 通过反射机制实例化对象

        try {
            Class c = Class.forName(classname);
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
