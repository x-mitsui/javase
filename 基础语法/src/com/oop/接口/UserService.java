package com.oop.接口;

public interface UserService {
    // 接口那日所有定义的方法其实都是抽象的 public abstract,
    // 接口需要有实现类
    public  void add();
    public  void delete();
    public  void update();
    public  void query();

    // 接口内可以定义常量, 比较少用
    // public static final
    int AGE =19;

    /**
     * 接口的作用:
     * 1. 约束,规范
     * 2. 定义一些方法,让不同的人实现
     * 3. 方法都是public abstract
     * 4. 变量都是public static final
     * 5. 接口不能被实例化, 接口中无构造方法
     * 6. implements可以实现多个接口
     * 7. 实现的类必须重写接口中的方法
     *
     *
     * */
}
