package annotation3;

public class MyAnnotationTest {

    @MyAnnotation(value = "hehe")
    public void doSome(){

    }

    // 属性只有一个value时, 属性名可以省略
    // 如果注解有两个属性, 就不能省略了
    @MyAnnotation("hoho")
    public void doOther(){

    }


}
