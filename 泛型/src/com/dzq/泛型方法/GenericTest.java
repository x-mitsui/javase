package com.dzq.泛型方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/11 - 07 - 11 - 13:54
 * @Description: com.dzq.泛型方法
 * @version: 1.0
 */

public class GenericTest<E> {
    // 泛型方法的泛型和泛型类的泛型无关
    // 泛型方法，调用方法时确定类型
    public <T> void say(T t){
        System.out.println(t);
    }

    // 泛型方法可以是静态方法，在使用时可以确定类型；而泛型类如果实现静态方法，则在使用这个静态方法时还不能确定类型，因为创建对象时才能确认
    public static <V> void listen(V v){

    }

    // 普通方法
    public void talk(E e){
        System.out.println(e);
    }

}

class Test{
    public static void main(String[] args) {
        GenericTest<Integer> integerGenericTest = new GenericTest<>();
        integerGenericTest.say("123");
        integerGenericTest.talk(123);

        List<Integer> list = new ArrayList<>();
    }
}
