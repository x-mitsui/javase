package com.集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap集合:
 * 1. HashMap集合底层是哈希表/散列表的数据结构
 * 2. 哈希表是一个数组和单向链表的结合体.
 *      数组: 在查询方面效率较高, 随机增删方面效率很低
 *      单向链表: 在随机增删方面效率很高, 在查询方面效率很低
 *      哈希表将以上的两种数据结构融合在一起, 充分发挥它们各自的优点
 * 3. 类似珠子门帘,HashMap集合底层的源代码:
 *  public class HashMap{
 *      // HashMap底层实际上就是一个一维数组
 *      Node<K, V>[] table;
 *
 *      // 静态的内部类HashMap.Node
 *      static class Node<K, V> implements Map.Entry<K,V> {
 *          final int hash;// 哈希值(哈希值是key的hashCode()方法的执行结果.hash值通过哈希函数/算法, 可以转化成数组的下标)
 *          final K key;// 存储到Map集合中的那个key
 *          V value;// 存储到Map集合中的那个value
 *          Node<K,V> next;// 下一个节点的内存地址
 *      }
 *      哈希表/散列表: 一维数组, 这个数组的每一个元素是一个单向链表(数组和单向链表的结合体)
 *  }
 *  4. 必须掌握这两个方法实现原理:
 *      map.put(k, v)
 *      v = map.get(k)
 *  4.1 map.put(k, v)原理
 *      第一步: 先将k,v封装到Node对象中
 *      第二步: 底层会调用k的hashCode()方法得出hash值, 然后通过哈希函数/哈希算法, 将hash值转换成数组的下标, 下标位置上如果没有任何
 *             元素, 就把Node添加到这个位置上了, 如果说下标对应的位置上有链表, 此时会拿着k和链表上每一个节点中的k进行equals, 如果所有的
 *             equals方法返回的都是false, 那么这个新节点将被添加到链表的末尾. 如果其中有一个equals返回了true, 那么这个节点的value
 *             将会被覆盖.
 *
 *  4.2 v = map.get(k)原理
 *      先调用k的hashCode()方法得出哈希值, 再通过哈希算法转换成数组下标, 通过数组下标快速定位到某个位置上, 如果这个位置上什么也没有,
 *      返回null. 如果这个位置上有单向链表, 那么会拿着参数k和单向链表上的每个节点中的k进行equals, 如果所有equals方法返回false, 那么
 *      get方法返回null, 只要其中有一个节点的k和参数k equals的时候返回true, 那么此时这个节点的value就是我们要找的value. get方法
 *      最终返回这个要找的value.
 *
 *  5. 为什么哈希表的随机增删, 以及查询效率很高
 *      增删是在链表上完成的
 *      查询也不需要都扫描, 只需要部分扫描
 *     重点: 通过讲解可以得出HashMap集合的key, 会先后调用两个方法, 一个方法时hashCode(), 一个方法时equals(), 那么这两个方法都需要重写.
 *
 *  6. HashMap集合的key部分特点:
 *      无序, 不可重复
 *      为什么无序? 因为不一定挂到哪个单项链表上
 *      不可重复怎么保证? equals方法来保证HashMap集合的key不可重复, 如果重复, value会覆盖.
 *
 *      放在HashMap集合key部分的元素其实就是放在HashSet集合中了.
 *      所以HashSet集合中的元素也需要通识重写hashCode()+equals()方法
 *
 *  7. 同一个单向链表上所有节点的hash值相同, 因为数组下标相同, 但同一个链表上k和k的equals方法肯定返回的是false
 *
 *  8. 哈希表HashMao使用不当时无法发挥性能
 *      假设将所有的hashCode()方法固定为某个值, 那么会导致底层哈希表变成了纯单向链表. 这种情况被称为: 散列分布不均匀
 *      什么是散列分布均匀?
 *          假设有100个元素, 10个单向链表, 那么每个单向链表上有10个节点, 这是最好的, 是散列分布均匀的
 *      假设所有的hashCode()方法返回值都设定为不一样的值,可以么?
 *      不行, 因为这样的话倒是底层哈希表就成为了一维数组, 没有链表的概念了. 也是散列分布不均匀.
 *
 *      散列分布均匀需要重写hashCode()方法时有一定技巧
 *   9. HashMap集合的默认初始化容量是16, 默认加载因子是0.75
 *      这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候, 数组开始扩容.
 *      重点, HashMap集合初始化容量必须是2的指数倍,这是因为达到散列均匀, 为了提高HashMap集合的存取效率
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        // Integer是key, hashCode和equals都重写了
        Map<Integer, String> map = new HashMap<>();
        map.put(123,"张三");
        map.put(33,"李四");
        map.put(8888,"王五");
        map.put(8888,"赵六");
        map.put(5,"赵六");

        System.out.println(map.size());

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> node : set){
            System.out.println(node);
        }
    }
}
