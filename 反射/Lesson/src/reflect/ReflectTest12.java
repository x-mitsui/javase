package reflect;

import reflect.bean.UserService;
import reflect.bean.VIP;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射机制创建一个java对象
 *
 * 通过反射机制调用构造方法实例化对象
 */
public class ReflectTest12 {
    public static void main(String[] args) {
        // 不使用反射机制创建一个java对象

        VIP vip1 = new VIP();
        VIP vip2 = new VIP(1);
        VIP vip3 = new VIP(1, "li", "1990-1-2");


        // 这些参数可以放在可配置文件里
        createObject("reflect.bean.VIP", 12, "123", "123", true);

    }

    public static void createObject(String className, int no, String name, String birth, boolean sex) {
        // 通过反射机制创建一个java对象的方法
        Class curClass = null;
        Object obj = null;
        Constructor con = null;
        try {
            curClass = Class.forName(className);
            // 调用无参数构造方法
            obj = curClass.newInstance();
            System.out.println(obj);
            // 调用有参数构造方法
            // 第一步: 先获取到有参数构造方法
            con = curClass.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
            // 第二步: 调用构造方法new对象
            Object newObj = con.newInstance(no, name, birth, sex);
            System.out.println(newObj);

            // 获取无参数构造方法第二种方式, 这也是官方推荐的方式
            Constructor con2 = curClass.getDeclaredConstructor();
            Object newObj2 = con2.newInstance();
            System.out.println(newObj2);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
