package reflect;

import reflect.bean.VIP;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 重点: 给你一个类, 怎么获取这个类的父类, 以及实现了哪些接口?
 *
 */
public class ReflectTest13 {
    public static void main(String[] args) {
        getParantClass("java.lang.String");
    }

    public static void getParantClass(String className) {
        // 通过反射机制创建一个java对象的方法
        Class curClass = null;
        try {
            curClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class superClass = curClass.getSuperclass();
        System.out.println("父类:"+superClass.getName());
        System.out.println("实现了哪些接口-------");
        // 获取此类实现的所有接口(一个类可以实现多个接口)
        Class[] interfaces = curClass.getInterfaces();
        for (Class in: interfaces) {
            System.out.println(in.getName());
        }

    }
}
