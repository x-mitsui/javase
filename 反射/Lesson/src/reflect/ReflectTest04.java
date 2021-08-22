package reflect;

/**
 * 研究Class.forName发生了什么?
 *  会导致类加载,所以只希望一个类的静态代码块执行, 其它代码一律不执行, 你可以使用Class.forName, 后面JDBC技术会使用
 */
public class ReflectTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("reflect.MyClass");
    }
}

class MyClass{
    // 静态代码块在类加载时执行, 并且只执行一次
    static{
        System.out.println("MyClass类的静态代码块执行");
    }
}