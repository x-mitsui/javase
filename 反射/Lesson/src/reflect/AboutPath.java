package reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 研究一下路径的问题
 *
 */
public class AboutPath {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            // 这种方式的路径缺点是: 移植性差, 在IDEA下默认的当前路径是project的根
            // 离开了IDEA可能就无效了
            reader = new FileReader("Lesson/src/classinfo.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 通用路径(跨操作系统), 前提:文件必须在类路径下, 类路径指,在src下都是类路径
        // src是类的根路径
        // getContextClassLoader获取当前线程的类加载器对象
        // getResource 类加载器对象的方法, 当前线程的类加载器默认从类的根目录加载资源

        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        System.out.println(path);// 获取到一个文件的绝对路径
        String path2 = Thread.currentThread().getContextClassLoader().getResource("reflect/notes.md").getPath();
        System.out.println(path2);// 获取到一个文件的绝对路径
    }
}
