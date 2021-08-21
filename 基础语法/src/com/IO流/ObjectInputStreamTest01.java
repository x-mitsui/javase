package com.IO流;

import java.io.*;

/**
 * ObjectInputStream 反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        //序列化
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("res/ObjectOutputStreamTest01"));
            // 开始反序列化对象
            Object obj = ois.readObject();

            // 反序列化回来是一个学生对象, 所以会调用学生对象的toString方法
            System.out.println(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}
