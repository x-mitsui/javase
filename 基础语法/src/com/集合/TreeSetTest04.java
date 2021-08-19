package com.集合;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet/TreeMap是自平衡二叉树, 遵循左小右大原则存放(存放的时候根据左小右大原则, 所以这个存放的时候要进行比较)
 * 遍历二叉树的时候有三种方式:
 *      前序遍历
 *      中序遍历
 *      后序遍历
 * 二叉树缩小了查找的范围
 * 试着画出数列存放的二叉树结构: 100 200 50 60 80 120 140 130 135 180 666 40 55
 * 采取中序遍历为: 40 50 55 60 80 100 120 130 135 140 180 200 666
 * compareTo方法的返回值很重要:
 *  返回0表示相同, value会覆盖
 *  返回>0, 会继续在右子树上找
 *  返回<0, 会继续在左子树上找
 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        Customer c1 = new Customer(32);
        Customer c2 = new Customer(2);
        Customer c3 = new Customer(1);
        Customer c4 = new Customer(33);
        // 创建集合对象
        Set<Customer> customers = new TreeSet<>();
        // 添加元素
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        //遍历, 从小到大自动排序
        for (Customer c : customers) {
            // 按照字典顺序自动排序
            System.out.println(c);
        }
    }
}

// 放在TreeSet集合中的元素需要实现java.lang.Comparable接口/
// 并且实现compareTo方法. equals可以不写
class Customer implements Comparable<Customer>{
    private int age;

    public Customer() {
    }

    public Customer(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 需要在这个方法中编写比较的逻辑, 按照什么比较
    // k.compareTo(t.key)
    // 比较规则由程序员指定
    @Override
    public int compareTo(Customer c) {
        // c1.compareTo(c2)
        // this和c比较
        int age1 = this.age;
        int age2 = c.age;
//        if(age1==age2){
//            return 0;
//        }else if (age1>age2){
//            return 1;
//        }else{
//            return -1;
//        }
        return age1 - age2;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
}

