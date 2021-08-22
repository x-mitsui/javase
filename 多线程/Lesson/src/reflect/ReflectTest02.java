package reflect;

import reflect.bean.User;

import java.util.Date;

/**
 * 获取到Class能干什么
 *  通过Class的newInstance方法来实例化对象
 *  注意: newInstance()内部实际上调用的是无参构造, 必须保证无参构造是存在的
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        // 通过反射机制, 获取Class, 通过Class获取实例化对象
        try {
            Class c = Class.forName("reflect.bean.User");//c代表User类型
            // newInstance会调用User这个类的无参数构造方法,完成对象的创建
            // 重点: newInstance()调用的是无参构造, 必须保证无参构造是存在的
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        //不使用反射机制创建对象
        User user = new User();
        System.out.println(user);

    }
}
