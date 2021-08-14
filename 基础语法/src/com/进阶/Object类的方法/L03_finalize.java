package com.进阶.Object类的方法;

/*

 1 在Object中源码protected修饰
 protected void finalize() throws Throwable { }
 2. finalize方法只有一个方法体,里面没有代码
 3. 不需要程序员手动调用,JVM的垃圾回收期负责调用这个方法;只需要重写.GC负责调用
 4. finalize方法执行时机:
 当一个java对象即将被垃圾回收器回收的时候,垃圾回收期负责调用finalize方法
 5. finalize方法实际上是SUN公司为java程序员准备的一个时机,垃圾销毁时机.
 如果希望在对象销毁时机执行一段代码的话,这段代码写在finalize方法当中.
 6. 静态代码块的作用是什么?
 static{
    ...
 }
 静态代码块在类加载时刻执行,并且只执行一次.
 这是一个SUN准备的类加载时机.
 finalize()方法同样也是SUN公司为程序员准备的一个时机,这个时机是垃圾回收时机.
 7. java的垃圾回收器不会启动,垃圾太少,或者时间太少,有可能启动,也有可能不启动
 */
public class L03_finalize {
    public static void main(String[] args) {
        //测试一
        // java的垃圾回收器不会启动,垃圾太少,或者时间太少,有可能启动,也有可能不启动
        Person p = new Person();
        p = null;
        System.gc();//此段代码建议垃圾回收器启动,但不一定启动,只是增加了启动的概率
        //测试二
//        for (int i = 0; i < 10000000; i++) {
//            Person p = new Person();
//            p = null;
//        }
    }
}

class Person{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("即将被销毁");
    }
}
