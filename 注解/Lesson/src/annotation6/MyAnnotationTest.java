package annotation6;

import java.lang.reflect.Method;

public class MyAnnotationTest {
    @MyAnnotation(username="admin", password="123")
    public void doSome(){

    }

    public static void main(String[] args) throws Exception {
        // 获取MyAnnotationTest的doSome方法上面的注解信息
        // 第一步 拿类
        Class c = Class.forName("annotation6.MyAnnotationTest");
        // 第二步 拿方法
        Method method = c.getDeclaredMethod("doSome");
        // 第三步 拿注释
        if(method.isAnnotationPresent(MyAnnotation.class)){// 先判断是否存在这个注解
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.username());
            System.out.println(myAnnotation.password());
        }
    }
}
