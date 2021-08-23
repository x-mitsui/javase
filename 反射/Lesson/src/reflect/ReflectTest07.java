package reflect;

import reflect.bean.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 重点: 通过反射机制访问一个java对象的属性
 *  给属性赋值
 *  获取属性的值
 *
 */
public class ReflectTest07 {
    public static void main(String[] args)  {
        // 不使用反射属性怎么获取一个对象的属性
        /**
         * 给属性赋值三要素:
         *  要素1: 对象s
         *  要素2: no属性
         *  要素3: 1111
         */
        Student student = new Student();
        student.no =111;
        System.out.println(student.no);


        // 这些参数可以放在可配置文件里
        updateFieldValue("reflect.bean.Student","no", 22222);
    }
    public static void updateFieldValue(String className, String fieldName, int upDateNumber){
        // 通过反射机制访问一个java对象的属性
        Class studentClass = null;
        Object obj = null;
        Field noField = null;
        try {
            studentClass = Class.forName(className);
            obj = studentClass.newInstance();
            noField = studentClass.getDeclaredField(fieldName);// 获取no属性(根据属性名称获取field)
            // 给obj对象(Student对象)的no属性赋值
            /**
             * 虽然使用了反射机制,属性赋值的三要素还是缺一不可:
             *  要素1: obj对象
             *  要素2: no属性
             *  要素3: 22222
             *  反射机制让代码复杂了, 但是为了一个"灵活", 也是值得的
             */
            noField.set(obj, upDateNumber);

            // 读取属性
            System.out.println(noField.get(obj));

            // 获取私有属性
            Field nameField = studentClass.getDeclaredField("name");
            // 打破封装, 可能会给不法分子留下机会
            // 这样设置完之后, 在外部也可以访问private的
            nameField.setAccessible(true);

            // 给私有属性name赋值
            nameField.set(obj, "jackson");

            // 获取私有name属性
            System.out.println(nameField.get(obj));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
