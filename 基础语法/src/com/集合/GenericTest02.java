package com.集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** JDK8.0之后推出: 自动类型推断机制(又称钻石表达式)
 */
public class GenericTest02 {
    public static void main(String[] args) {


        // ArrayList<这里的类型会自动推断>(), 前提是JDK8之后才允许.
        // 自动类型推断机制(又称钻石表达式)
        List<Animal> myList = new ArrayList<>();

        // 把对象添加到集合中
        myList.add(new Cat());
        myList.add(new Bird());
        myList.add(new Animal());

        // 获取迭代器
        Iterator<Animal> it = myList.iterator();
        while(it.hasNext()){
            // 使用泛型之后, 每一次迭代返回的数据都是Animal类型
            // 这里不需要进行强制类型转换了, 直接调用
            Animal a = it.next();
            a.move();

            // 调用子类型特有方法还是要向下转型
            if(a instanceof Cat){
                ((Cat) a).jump();
            }
            if(a instanceof Bird){
                ((Bird) a).eatWorm();
            }
        }

        List<String> strList = new ArrayList<>();
//        strList.add(new Cat());// 类型不匹配
        strList.add("abc");
        strList.add("http://www.baidu.com");
//        strList.add(123);// 类型不匹配
        System.out.println(strList.size());
        Iterator<String> it2 = strList.iterator();
        while (it2.hasNext()){
            // 如果没用泛型
//            Object obj = it2.next();
//            if(obj instanceof String){
//                ...
//            }
            // 直接通过迭代器获取了String类型的数据
            String s = it2.next();
            String newStr = s.substring(7);
            System.out.println(newStr);
        }
    }
}



