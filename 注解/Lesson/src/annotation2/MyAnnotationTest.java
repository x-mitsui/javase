package annotation2;

public class MyAnnotationTest {
    // 报错原因如果一个注解当中有属性, 那么必须给属性赋值(除非该属性使用default指定了默认值)
    /*@MyAnnotation()
    void doSome(){

    }*/

    //@MyAnnotation(属性名=属性值, 属性名=属性值, 属性名=属性值)
    @MyAnnotation(name = "张三", color = "red")
    public void doSome(){

    }


}
