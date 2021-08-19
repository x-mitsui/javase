package com.集合;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map接口中常用的方法:
 *  1. Map和Collection没有继承关系
 *  2. Map集合以key和value的方式存储数据: 键值对
 *      key和value都是引用数据类型.
 *      key和value都是存储对象的内存地址
 *      key起到主导的地位, value是key的一个附属品
 *  3. Map接口中常用方法:
 *      V put(K key, V value) 向Map集合中添加键值对
 *      V get(Object key) 通过key获取value
 *      void clear()  清空Map集合
 *      boolean	containsKey(Object key)  判断Map中是否包含某个key
 *      boolean	containsValue(Object value)  判断Map中是否包含某个value
 *      boolean	isEmpty()  判断Map集合中元素个数是否为0
 *      V  remove(Object key)  通过key删除键值对
 *      int	size()  获取Map集合中的键值对的个数
 *      Collection<V>	values()    获取Map集合中所有的value, 返回一个Collection
 *
 *      Set<K>	keySet()  获取Map集合所有的key(所有的键是Set集合)
 *
 *      Set<Map.Entry<K,V>>	entrySet() 将Map集合转化成Set集合:
 *          假设现在有一个Map集合, 如下所示:
 *          map1集合对象:
 *          key         value
 *          -----------------
 *          1           zhangsan
 *          2           lisi
 *          3           zhaowu
 *          4           wangliu
 *
 *          Set set = map1.entrySet();
 *          set集合对象:(注意: Map集合通过entrySet()方法转换成的这个Set集合, Set集合中的元素的类型是 Map.Entry<K,V>,
 *                      Map.Entry和String一样, 都是一种类型的名字, 只不过:Map.Entry是静态内部类, 是Map中的静态内部类
 *                      可参照本包内MyClass.java文件分析)
 *          1=zhangsan (见MapTest02)
 *          2=lisi
 *          3=zhaowu
 *          4=wangliu
 */
public class MapTest01 {
    public static void main(String[] args) {
        // 创建
        Map<Integer,String> map01 = new HashMap<>();

        // 添加键值对
        map01.put(1, "zhangsan");
        map01.put(2, "lisi");
        map01.put(3, "zhaowu");
        map01.put(4, "wangliu");

        // 通过key获取value
        String value = map01.get(2);
        System.out.println(value);

        // 获取键值对数量
        System.out.println("键值对数量:"+ map01.size());

        // 删除键值对
        map01.remove(2);
        System.out.println("键值对数量:"+ map01.size());

        // contains方法底层调用的都是equals进行比对的, 所以自定义的类型都需要重写equals
        System.out.println(map01.containsKey(2));
        System.out.println(map01.containsValue("zhaowu"));

        // 获取所有的value
        Collection<String> values = map01.values();
        for (String s :
                values) {
            System.out.println(s);
        }
        // 清空
        map01.clear();
        System.out.println("是否为空:"+map01.isEmpty());




    }
}
