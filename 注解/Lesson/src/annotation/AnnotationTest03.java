package annotation;

/**
 * 注解标注的元素已经过时, 向其他程序员告知此方法已经过时, 有更好的方案
 * @Deprecated
 */
public class AnnotationTest03 {
    public static void main(String[] args) {
        T.doSome();
        T.doOther();
    }


}

class T{
    @Deprecated
    public static void doSome(){

    }
    public static void doOther(){

    }
}
