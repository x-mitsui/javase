package com.oop.instanceof方法;

public class Application {
    public static void main(String[] args) {
        //Object > Person > Student
        Object obj = new Student(); //实例是Student对象,引用是Object类型
        System.out.println(obj instanceof Student);
        System.out.println(obj instanceof Person);
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof Teacher);
        System.out.println(obj instanceof String);

        System.out.println("--------------");

        Person p = new Student();
        System.out.println(p instanceof Student);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Object);
        System.out.println(p instanceof Teacher);
//        System.out.println(p instanceof String);//编译报错

        System.out.println("--------------");

        Student s = new Student();
        System.out.println(s instanceof Student);
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Object);
//        System.out.println(s instanceof Teacher);//编译报错
//        System.out.println(s instanceof String);//编译报错
        /*
        * 总结:
        * System.out.println(X instanceof Y);
        * 查看实例(X)的类型是否可以通过父子关系线性查找到Y
        * */


        // 类型转换: 父子转换
        // 向上转型(多态基础) : 通过子类对象(小范围)实例化父类对象(大范围),这种属于自动转换; 向上转型时,父类只能调用父类方法或者子类覆写后的方法,而子类中的单独方法则是无法调用的.
        // 向下转型(工程上很少用) : 通过父类对象(大范围)实例化子类对象(小范围),这种属于强制转换,会有精度损失
        // 方便方法的调用,减少重复的代码
        Person person = new Student();
        ((Student)person).eat();// 向下转型,调用子类独有的方法

    }
}
