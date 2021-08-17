package com.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
测试Collection的contains方法
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        User u1 = new User("jack");
        User u2 = new User("jack");

        c.add(u1);

        // 没有重写equals之前: 这个结果是false;重写后为true
        System.out.println(c.contains(u2));

        Integer x = new Integer(10000);
        c.add(x);
        Integer y = new Integer(10000);
        System.out.println(c.contains(y));

        // remove删除的时候内部也调用了equals方法
        Collection cc = new ArrayList();
        cc.add(new String("abc"));
        cc.remove(new String("abc"));
        System.out.println(cc.size());

        Collection cc2 = new ArrayList();
        cc2.add(new User("张三"));
        cc2.remove(new User("张三"));
        System.out.println(cc2.size());
    }


}
class User{
    private String name;
    public User(){};
    public User(String name){
        this.name = name;
    };

    // 重写equals
    // 将来调用equals方法的时候, 一定会调用这个重写的equals方法
    // 这个equals方法的比较原理是: 只要姓名一样就表示同一个用户
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return this.name.equals(user.name);
    }


}