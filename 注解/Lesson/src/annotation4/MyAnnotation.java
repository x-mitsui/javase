package annotation4;

/**
 * 注解当中的属性可以是哪一种类型?
 * byte short int long float double boolean char String Class 枚举类型
 * 以及以上每一种类型的数组
 */
public @interface MyAnnotation {

    String value1();
    int value2();
    int[]  value3();
    String[] value4();
    Season value5();
    Season[] value6();

    Class parameterType();
    Class[] parameterTypes();

}
