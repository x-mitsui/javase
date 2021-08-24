package annotation;

/**
 * 关于JDK lang包下的Override注解
 * @Override只能注解方法
 * @Override这个注解是给编译器参考的, 和运行阶段没有关系
 * 凡是java的方法带有这个注解的, 编译器都会进行编译检测, 如果这个方法不是重新父类的方法, 编译器报错
 *
 * 只是在编译阶段起作用, 和运行阶段无关
 */
public class AnnotationTest02 {
    @Override
    public String toString() {
        return "AnnotationTest02{}";
    }
}
