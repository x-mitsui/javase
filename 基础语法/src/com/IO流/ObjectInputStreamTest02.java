package com.IO流;

import com.IO流.beans.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * ObjectInputStream 反序列化(二)
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        //序列化
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("res/ObjectOutputStreamTest02"));
            // 开始反序列化对象
            List<User> userList = (List<User>)ois.readObject();

            System.out.println(userList instanceof List);
            for (User user: userList) {
                System.out.println(user);
            }
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
