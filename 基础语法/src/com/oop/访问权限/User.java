package com.oop.访问权限;

public class User {
    /*
    * 默认
    * private 私有的 只能在本类中访问
     * public 公开的,任何位置都可以访问
     * protected
     * "默认"只能表示只能在本类及同包下访问
     * 范围public>protected>默认>private
     * 可以修饰:
     * 属性(包括静态) (4个)
     * 方法(包括静态) (4个)
     * 类 (public 默认)
     * 接口 (public 默认)
    * */
    /*
    * 访问控制符         本类      同包或同包子类(Test01 Son01)      不同包子类(Son02)      不同包且不是子类(Test02)
    * public           可以      可以                               可以                  可以
    * protected        可以      可以                               可以                  不行
    * 默认              可以      可以                               不行                   不行
    * private          可以      不行                               不行                  不行
    *
    * public所有都可以,
    * private只有本类才可以
    * protected同包和子类才可以
    * 默认出了包就废了
    * */
    private float weight =180;
    float height=188;
    protected String name="张三";
    public int age=31;

}
