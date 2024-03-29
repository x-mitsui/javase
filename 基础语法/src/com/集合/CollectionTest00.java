package com.集合;

/**
 * 1. 集合概述
 * 1.1 什么是集合?有什么用?
 *     数组其实就是一种集合,集合实际上就是一个容器. 可以用来容纳其它类型的数据.
 *
 *     集合为什么说在开发中使用较多?
 *      集合是一个容器, 是一个载体, 可以一次容纳多个对象.
 *      在实际开发中, 假设连接数据库, 数据库当中有10条记录,那么假设把这10条记录查询出来, 在java程序中会将10条数据
 *      封装成10个java对象, 然后将10个java对象放到某一个集合当中,将集合传到前端, 然后遍历集合, 将一个数据一个数据展现出来
 *
 * 1.2 集合不能直接存储基本数据类型, 另外集合也不能直接存储java对象, 集合当中存储的都是java对象的内存地址.(或者说集合中存储的是引用);
 *  list.add(10); // 自动装箱Integer
 *  注意: 集合在java中本身是一个容器, 是一个对象. 集合中任何时候存储的都是引用.
 *
 * 1.3 在java中每一个不同的集合, 底层会对应不同的数据结构. 往不同的集合中存储元素, 等于将数据放到了不同的数据结构当中
 * 什么是数据结构? 数据存储的结构就是数据结构. 不同的数据结构, 数据存储方式不同. 例如: 数组 二叉树 链表 哈希表 图等数据结构
 * java已经将数据结构实现了, 主要需要区分什么情况下使用什么数据结构.
 *
 * 1.4 集合在java JDK哪个包下
 * java.util.*
 * 所有的集合类和集合接口都在java.util包下.
 *
 * 1.5 Java中集合分为两大类
 *  一类是单个方式存储元素, 超级父接口: java.util.Collection
 *  一类是以键值对的方式存储元素, 超级父接口: java.util.Map
 *
 *  Iterator it = "Collection对象".iterator();
 *  it是迭代器对象
 * 2. 主要掌握:
 *  每个集合对象的创建
 *  向集合添加元素
 *  从集合中取出元素
 *  遍历集合
 */
public class CollectionTest00 {

}
