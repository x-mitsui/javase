package com.集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** JDK5.0之后推出
 * 1. 泛型这种语法机制, 只在程序编译阶段起作用, 只是给编译器做参考的(运行阶段泛型没用)
 * 2. 使用了泛型好处是什么?
 *      第一: 集合中存储的元素类型统一了
 *      第二: 从集合中取出的元素类型是泛型指定的类型, 不需要大量的"向下转型"
 * 3. 缺点:
 *      导致集合中存储的元素缺乏多样性
 * 4. 大多数业务中, 集合中元素类型还是统一的, 所以这种泛型特性被大家认可.
 */
public class GenericTest01 {
    public static void main(String[] args) {
        // 不使用泛型机制, 分析程序存在缺点
        /*
        List myList = new ArrayList();

        // 准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        // 把对象添加到集合中
        myList.add(c);
        myList.add(b);

        // 遍历集合, 取出每个animal,调用move
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object o = it.next();
            //Object没有move方法,需要向下转型
            ((Animal)o).move();
//            if(o instanceof Cat){
//                ((Cat) o).catchMouse();
//            }
//            if(o instanceof Bird){
//                ((Bird) o).fly();
//            }
        }
         */

        // 使用JDK5之后的泛型
        // 使用泛型List<Animal>之后, 表示List集合只允许存储Animal类型的数据
        List<Animal> myList = new ArrayList<Animal>();

        // 指定List集合中只能存储Animal, 那么存储String就编译报错了
        // 这样用了泛型之后, 集合中元素的数据类型就更加统一了
        //myList.add("abc");// 编译报错Required type :Animal, Provided:String

        // 准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        // 把对象添加到集合中
        myList.add(c);
        myList.add(b);

        // 获取迭代器
        // 表示迭代器迭代的是Animal类型
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
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("猫抓老鼠");
    }
    public void jump(){
        System.out.println("猫跳");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿飞");
    }
    public void eatWorm(){
        System.out.println("鸟吃虫");
    }
}

