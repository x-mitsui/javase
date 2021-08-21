package com.IO流;

import com.IO流.beans.Student;
import com.IO流.beans.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 可以一次序列化多个对象么?
 *  可以, 可以将对象放到集合当中, 序列化集合
 *  注意: 参与序列化的ArrayList集合以及集合中的元素User都需要实现 java.io.Serializable接口
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {
        List<User> userList= new ArrayList<>();
        userList.add(new User(12,"lisi"));
        userList.add(new User(2,"wangwu"));
        userList.add(new User(13,"赵六"));
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("res/ObjectOutputStreamTest02"));
            oos.writeObject(userList);
            oos.flush();
            oos.close();
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
