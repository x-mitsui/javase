package annotation7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        // 第一步获取类
        Class userClass = Class.forName("annotation7.User");
        boolean isOK = false;
        // 判断类上是否有MustHasIdProperty注解
        if(userClass.isAnnotationPresent(MustHasIdProperty.class)){
            // 当一个类上面有@MustHasIdProperty注解的时候, 要求类中必须存在int类型的id属性
            // 如果没有int类型的id属性则报异常
            // 获取类的属性
            Field[] fields = userClass.getDeclaredFields();
            for (Field field : fields) {
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                    // 表示这个类是合法的类, 有@id注解, 则这个类必须有int类型的id
                    isOK=true;
                    break;
                }
            }
        }
        if(!isOK){
            throw new HasNotIdException("被@Id注解标注的类中必须要有一个int类型的id属性");
        }
    }
}
