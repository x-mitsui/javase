package annotation5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 只允许该注解可以标注类/方法
@Target({ElementType.TYPE,ElementType.METHOD})
// 希望这个注解可以被反射到
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String Address() default "北京昌平区";
}
