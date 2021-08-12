package com.oop.final关键字;

/*
 * 1. final修饰的类
 * */
//如果不希望对FinalTest类的功能进行扩展,可以加final关键字
public final class  FinalTest {
    public void doSome(){

    }
}

//class B extends FinalTest{
//
//}

//String也是final
//class C extends String{
//
//}

/*
* 2. final修饰的方法
* */
class E{
    public int i;
    // final修饰的方法无法被重写
    public final void doSome(){

    }
}
class F extends E{

//    public void doSome(){
//
//    }
}

/*
 * 3. final修饰的局部变量
 * */
class H{
    public final static int STATIC_VALUE = 100;//如果成员变量是常量,为节省内存,建议添加static转变成静态变量
    public final void doSome(){

    }

    public static void main(String[] args) {
        // 局部变量无初始值,和成员变量不同
        int i = 100;
        i = 200;
        final int k = 3;// 类似其它语言的const
//        k = 3;
        final int s;
        s = 8;// 只能赋一次值
//        s = 5;
        /////////////////
        final E e = new E();
//        e=new E();//不同重新赋值
//        4 = null;//不同重新赋值,直到当前方法结束才回收
        e.i = 4;//内部数据可以修改
    }
}
