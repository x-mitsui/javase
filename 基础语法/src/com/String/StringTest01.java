package com.String;

/**
 * 关于Java JDK中内置的一个类: java.lang.String;
 * 1. String表示字符串类型, 属于引用类型, 不属于基本类型;
 * 2. 在java中随便使用双引号括起来的都是String对象. 例如:"123" "ab" "";
 * 3. java中规定, 双引号括起来的字符串, 是不可变的, 也就是说"abc"从出生到死亡, 不可变, 不能变成"abcd",也不能变成"ab";
 * 4. 在JDK当中双引号括起来的字符串, 例如:"abx" "沙发上" 都是直接存储在 方法区的"字符串常量池" 当中的.
 * 为什么把字符串设置在一个"字符串常量池"当中呢? 因为字符串在实际的开发中使用频繁, 为了执行效率才这样做.
 * 5. String为什么是不可变的
 * String类中有一个char[]数组,这个char[]数组采用了final修饰, 因为数组一旦创建, 长度就不可变.
 * 并且被final修饰的引用一旦指向某个对象,不可再指向其它对象,所以String是不可变的.
 * 6. StringBuffer和StringBuilder为什么是可变的?
 * StringBuffer/StringBuilder内部实际上一个char[]数组,这个char[]数组没有被final修饰,StringBuffer/StringBuilder的
 * 初始化容量是16, 当存满知乎会进行扩容, 底层调用了数组拷贝的方法System.arraycopy()来进行扩容,所以StringBuffer/StringBuilder适合
 * 字符串的频繁拼接操作.
 * String s = "xyz";
 * s = "abc";// s没有被final修饰,所以s可变;不可变指的不是它
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "av";// s1是局部变量, 指向方法区 字符串常量池的一个内存地址,所以s1保存的不是"av",是一个地址
        /**
         *  "xy"也在字符串常量池内, 最后合成一个新字符串,将地址传给s2;而其中"av"不需要再创建,第二次可以直接使用,
         *  这就是将字符串放在字符串常量池的好处, 复用性强
         *  s1和s2共创建了3个字符串对象, 都在字符串常量池中
         */
        String s2 = "av" + "xy";

        /**
         * 分析: 这是使用new方式创建的字符串对象,这个代码中的"xy"是从哪里来的?
         * 注意: 凡是双引号括起来的都在字符串常量池中有一份.所以还是在字符串常量区
         * new对象的时候一定在堆内存中开辟空间.
         * s3保存指向String对象的内存地址, 而String对象保存的是指向xy"字符串对象的内存地址.
         */
        String s3 = new String("xy");
    }
}
