package com.oop.接口;

// 接口也是一种引用数据类型
// 接口是完全抽象的
// 接口支持多继承
// 接口只包含两部分内容:常量(注意是常量)和抽象方法,抽象方法可以省去public abstract关键字
// 接口中所有元素都是public修饰的
// 接口中方法不能有方法体
// 接口中的常量的public static final可以省略.访问用 接口名.常量 访问
// 类和类直接叫做继承, 类和接口之间叫做实现, 当然你仍可以将"实现"看做"继承"
// 实现的类的方法的权限不能比接口对应方法权限低
// 经过测试:接口和接口之前在进行强制类型转换的时候,没有继承关系,也可以强转,但是一定要注意,运行时可能会出现ClassCastException异常
// 所以还是需要instanceof判断, 怪异的特性,
public interface UserService {
    // 接口那日所有定义的方法其实都是抽象的 public abstract,
    // 接口需要有实现类
    public  void add();
    public  void delete();
    public  void update();
    public  void query();

    // 接口内可以定义常量, 比较少用
    public static final int AGE =19;

    /**
     * 接口的作用:
     * 1. 约束,规范
     * 2. 定义一些方法,让不同的人实现
     * 3. 方法都是public abstract
     * 4. 变量都是public static final
     * 5. 接口不能被实例化, 接口中无构造方法
     * 6. implements可以实现多个接口
     * 7. 实现的类必须重写接口中的方法
     * 8. 面向接口编程,可以降低程序的耦合性 ,提供程序的扩展里,复合ocp原则
     * 9. 接口离不开多态
     * 10.所以接口可以解耦合,解的是谁的耦合
     *    答:任何接口都有实现者和调用者, 接口可以将实现者和调用者解耦,调用者面向接口调用,实现者面向接口编写实现
     *    大项目的开发,一般都是将项目分离成一个个模块, 模块和模块之间用接口衔接, 降低耦合度
     * */
}

interface A{}
interface B{}
//多继承
interface C extends A,B{

}