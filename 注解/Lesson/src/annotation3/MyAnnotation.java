package annotation3;

/**
 * 我们通常在注解当中可以定义属性, 以下这个是MyAnnotation的name属性
 * 看着像一个方法, 但是实际上我们称之为属性name
 */
public @interface MyAnnotation {

    String value();

}
