package com.集合;

import java.util.ArrayList;
import java.util.List;

/*
1. ArrayList初始化容量是10(JDK13:底层先创建了一个长度为0的数组,当添加一个元素的时候, 初始化数量10)
2. 底层是Object类型的数组Object[]
3. 构造方法:
        new ArrayList();
        new ArrayList(20);
4. 扩容到原容量的1.5倍
5. 建议给定一个预估计的初始化容量, 减少数组的扩容次数, 这是ArrayList集合比较重要的优化策略.
6. 优点: 检索效率比较高(因为每个元素占用空间大小相同, 内存地址是连续的, 知道首元素内存地址,
        然后知道下标, 通过数学表达式就能计算出元素的内存地址, 所以检索效率高.)
7. 缺点: 随机增删效率比较低, 但向数组末尾添加元素, 效率较高,因为数组未满的情况下, 计算下一个空位置很快; 另外,数组无法存储大数据量(因为很难找到一块非常巨大的连续的内存空间)
8. ArrayList相对其它集合使用多, 因为检索快, 末尾添加元素效率高
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        // 默认初始化容量10
        List list01 = new ArrayList();
        // 集合的size()方法是获取当前集合中元素的个数. 不是获取集合的容量.
        System.out.println(list01.size());

        // 指定初始化容量20
        List list02 = new ArrayList(20);
        // 集合的size()方法是获取当前集合中元素的个数. 不是获取集合的容量.
        System.out.println(list01.size());


    }
}
