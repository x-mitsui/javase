package annotation;

/**
    默认情况下, 注解可以出现在任意地方
 */
@MyAnnotation
public class AnnotationTest01 {
    @MyAnnotation
    private int no;
    @MyAnnotation
    public AnnotationTest01(){}
    @MyAnnotation
    public static void m1(){
        @MyAnnotation
        int i =100;
    }
    @MyAnnotation
    public void m2(@MyAnnotation int a,@MyAnnotation String b){

    }
}
@MyAnnotation
interface MyInterface{

}
@MyAnnotation
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
