# 注解
### 注解, 或者叫注释, annotation
### 注解Annotation是一种引用数据类型. 编译之后也是生成xxx.class文件
### 怎么自定义注解呢, 语法格式?

    [修饰符列表] @interface 注解类型名{
    
    }
### 注解怎么使用, 用在什么地方
    第一: 注解使用时的语法格式是:
        @注解类型名
    第二: 注解可以出现在类上, 属性上, 方法上, 变量上等
    注解还可以出现在注解类型上

### JDK有哪些注解
    Deprecated(重要): 用 @Deprecated 注释的程序元素，不鼓励程序员使用这样的元素，通常是因为它很危险或存在更好的选择。
    Override(重要): 表示一个方法声明打算重写超类中的另一个方法声明。
    SuppressWarnings: 指示应该在注释元素（以及包含在该注释元素中的所有程序元素）中取消显示指定的编译器警告。

### 元注解
    用来标注"注解类型"的"注解"称为元注解
    常见的元注解有哪些?
        Target
        Retention
    关于Target注解:
        这个元注解用来标注"被标注的注解"可以出现在哪些位置上
        @Target(ElementType.METHOD): 表示"被标注的注解"只能出现在方法(METHOD)上
        @Retention(RetentionPolicy.SOURCE): 表示"被标注的注解"最终保存到java源文件中.
        @Retention(RetentionPolicy.CLASS): 表示"被标注的注解"被保留在.class文件中
        @Retention(RetentionPolicy.SOURCE): 表示"被标注的注解"被保留在class文件中,并且可以被反射机制读取.
    retention	英[rɪˈtenʃn]
    美[rɪˈtenʃn]
    n.	保持; 维持; 保留; (液体、热量等的)保持，阻滞; 记忆力; 记性;
