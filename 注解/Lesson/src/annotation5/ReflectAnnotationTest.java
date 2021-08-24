package annotation5;

public class ReflectAnnotationTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取类
        Class c =Class.forName("annotation5.MyAnnotationTest");
        //System.out.println(ReflectAnnotationTest.class);
        // 判断上面是否有@MyAnnotation
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));
        if(c.isAnnotationPresent(MyAnnotation.class)){
            // 获取该注解
            MyAnnotation myAnnotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println("类上的注解对象" + myAnnotation);
            // 获取注解对象的属性, 和调接口没区别
            String Address = myAnnotation.Address();
            System.out.println(Address);


        }

        // 判断String类上面是否存在这个注解
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation.class));


    }
}
