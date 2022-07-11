package com.dzq.自定义泛型结构;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/11 - 07 - 11 - 13:09
 * @Description: com.dzq.自定义泛型结构
 * @version: 1.0
 */
public class GenericTest<E> {
    E number;

    int[] a(E e){
        return new int[]{12,1};
    };

    E[] b(E[] e){
        return (E[])new Object[10];
    };
}

// 继承与泛型
class SubClass extends GenericTest<Integer>{

}

class SubClass2<E> extends GenericTest<E>{

}



class Test{
    public static void main(String[] args) {
        // 创建对象时不指定泛型，泛型类型默认为Object
        GenericTest G = new GenericTest();
        G.a("123");
        G.a(false);
        G.b(new String[]{"123","345"});

        // 创建对象时才指定泛型类型
        GenericTest<Integer> G2 = new GenericTest<Integer>();
        G2.a(123);
        G2.a(456);
        G2.b(new Integer[]{1, 23});



    }
}