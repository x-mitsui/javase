package com.内部类;
/**
 * 1. 内部类定义: 在类的内部又定义了一个新的类, 这个心类被称为内部类
 * 2. 内部类分类:
 *  静态内部类: 类似于静态变量
 *  实例内部类: 类似于实例变量
 *  局部内部类: 类似于局部变量
 * 3. 使用内部类编写的代码可读性太差,能不用尽量不用
 * 4. 可以设置访问权限
 * 5. 匿名内部类是局部内部类的有一种,因为这个类没有名字而得名
 * */
public class Test01 {
    // 该类在类的内部,所以称为内部类;由于有修饰符static,所以称为静态内部类
    static class Inner1{

    }
    // 该类在类的内部,所以称为内部类;无static,称为实例内部类
    class Inner2{

    }
    public void doSome(){
        // 该类在类的内部,所以称为内部类;局部内部类
        class Inner3{

        }
    }

    public void doOther(){
        // doSome()方法中的局部内部类Inner3, 在doOther()中不能使用
    }

    public static void main(String[] args) {
        // 调用MyMath中的mySum方法
        MyMath myMath = new MyMath();
        // 方法一: 普通方式实现
        myMath.mySum(new ComputeImp(),1,2);

        // 方法二: 匿名内部类实现方式
        // 使用匿名内部类, 表示这个ComputeImp这个类没名字了
        // 这里表明看上去好像是接口可以直接new了,实际上并不是接口可以new了
        // 后面的{}代表了对接口的实现
        // 不建议使用匿名内部类.
        // 1.匿名内部类无法复用,2.代码可读性差
        myMath.mySum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },1,2);

    }
}
//负责计算的接口
interface Compute{
    // 抽象方法
    int sum(int a, int b);
}
// Compute接口的实现类
class ComputeImp implements Compute{
    // 对方法的实现
    public int sum(int a, int b){
        return a + b;
    }
}
// 数学类
class MyMath{
    public void mySum(Compute c, int x, int y){
        int ret = c.sum(x, y);//运行动态绑定
        System.out.println(x+"+"+y+"="+ret);
    }
}