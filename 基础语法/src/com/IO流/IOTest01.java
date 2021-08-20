package com.IO流;

/**
 * 1. 定义:
 *  通过IO可以完成硬盘文件的读写
 * 2. IO流的分类:
 *  一种方式以内存为参照物: 往内存中去, 叫做输入, 或者叫读, 从内存中出来叫输出
 *
 *  另一种按照读取数据方式不同来分类: 有的流是按照字节的方式读取数据, 一次读取1个字节byte, 等同于一次读取8个二进制位
 *      这种流是万能的, 什么类型的文件都可以读取, 包括 文本 图片 声音文件 视频文件
 *      假设windows文件file1.txt, 采用字节流的话是这样读的:
 *          a中国bc张三fe
 *              第一次读一个字节正好读到'a'
 *              第二次读一个字节,正好读到'中'字符的一半
 *              第三次读一个字节,正好读到'中'字符的另一半
 *
 *      有的流是按照字符的方式读取数据的, 一次读取一个字符, 这种流是为了方便读取普通文本文件而存在的, 这种流不能读取: 图片 声音 视频等文件.
 *      只能读取纯文本文件, 连word文件都不能读取.
 *
 *      假设windows文件file1.txt, 采用字符流的话是这样读的:
 *          a中国bc张三fe
 *              第一次读'a'字符('a'字符在windows系统中占1个字节, 这个字符和Java的char字符不同, Java的char占两个字节)
 *              第二次读'中'字符('中'字符在windows系统中占2个字节)
 *
 * 3. JAVA中的IO流都已经写好了, 我们程序员不需要关心, 主要掌握Java提供了哪些流, 什么特点, 怎么用
 * 4. Java中所有流在java.io.*下
 * 5. Java IO流 四大家族(都是抽象类)
 *      java.io.InputStream 字节输入流
 *      java.io.OutputStream 字节输出流
 *      java.io.Reader 字符输入流
 *      java.io.Writer 字符输出流
 *  注意: 在java中以Stream[[结尾]]的都是字节流, 以"Reader/Writer"[[结尾]]的都是字符流
 *
 *  所有的流都实现了: java.io.Closable接口, 都是可关闭的, 都有close()方法.
 *  流毕竟是一个管道, 这个是内存和硬盘之间的通道, 用完之后一定要关闭, 不然会耗费(占用)很多资源.
 *  所以养成习惯, 用完流要关闭.
 *
 *  所有的输出流都实现了:
 *      java.io.Flushable接口, 都是可刷新的, 都有flush()方法.
 *      养成一个好习惯, 输出流在最终输出之后, 一定要记得flush()刷新一下. 这个刷新表示将通道/管道当中剩余未输出的数据
 *      强行输出完(清空管道!) 刷新的作用就是清空管道. 注意: 如果没有flush()可能会丢失数据.
 * 6. java.io包下需要掌握的流有16个:
 *     文件专属:
 *      java.io.FileInputStream *!
 *      java.io.FileOutputStream *!
 *      java.io.FileReader
 *      java.io.FileWriter
 *
 *     转换流:(将字节流转换成字符流)
 *      java.io.InputStreamReader
 *      java.io.OutputStreamWriter
 *
 *     缓冲流专属:
 *      java.io.BufferedReader
 *      java.io.BufferedWriter
 *      java.io.BufferedInputStream
 *      java.io.BufferedOutputStream
 *
 *     数据流专属:
 *      java.io.DataInputStream
 *      java.io.DataOutputStream
 *
 *     标准输出流:
 *      java.io.PrintWriter
 *      java.io.PrintStream *!
 *
 *     对象专属流:
 *      java.io.ObjectInputStream *!
 *      java.io.ObjectOutputStream *!
 *
 * 7. File类
 * 8. 能用记事本打开的都是普通文本文件, 和后缀名无关
 */
public class IOTest01 {
}
