package com.IO流;

import com.IO流.beans.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream
 * 参与序列化和反序列化的对象, 必须实现Serializable接口
 * public interface Serializable{
 *
 * }
 * 这个接口什么代码也没有,起到标识作用,java虚拟机看到这个接口, 会为该类自动生成一个序列化版本号
 * 什么情况下会用到序列化？
 *
 *      1. 当你想把内存中的对象写入到硬盘时
 *
 *      2. 当你想用套接字在网络上传输对象时
 *
 *      3. 当你想通过RMI调用对象时
 *
 *     （RMI是什么东西？）：RMI总结来说就是远程调用对象，在一个jvm上调用另一个jvm的对象
 *      个人总结：serializable接口就是Java提供用来进行高效率的异地共享实例对象的机制，实现这个接口即可
 *
 * 序列化版本号不固定,修改类源码文件后会报错
 *      java.io.InvalidClassException: com.IO流.beans.Student;
 *      local class incompatible: stream class
 *      desc serialVersionUID = -9113737519491676558,
 *      local class serialVersionUID = -374564898012355939
 *
 * java语言中采用什么机制来区分类?
 *      第一: 通过类名比较区分
 *      第二: 如果类名相同, 则序列化版本号区分
 *
 * 举例:
 *      小明编写了一个类: com.test01.Student
 *      小红编写了一个类: com.test02.Student
 *
 *      不同的人编写了同名的类, 但这两个类确实不是同一个"类", 这个时候序列化版本号就起了作用
 *      对于java虚拟机来说,java虚拟机可以区分开这两个类的,因为这两个类实现了Serializable接口,
 *      都有默认的序列化版本号而且不同, 所以区分开了,这是自动生成序列化版本号的好处
 *
 *
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
        // 创建java对象
        Student s = new Student(111,"张三");
        //序列化
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("res/ObjectOutputStreamTest01"));
            // 序列化对象
            oos.writeObject(s);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}
