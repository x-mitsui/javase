package com.IO流;

import java.io.*;

/**
 * DataInputStream: 数据字节输入流
 * DataOutputStream写的文件只能用DataInputStream去读, 并且读的时候需要提前知道"写入的顺序".
 * 读的顺序需要和写的数据一致,才可以正常读取.
 */
public class DataInputStreamTest {
    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("res/DataOutputStreamTest"));
            byte a =dis.readByte();
            short b = dis.readShort();
            int c =dis.readInt();
            long d =dis.readLong();
            double e = dis.readDouble();
            float f = dis.readFloat();
            boolean g = dis.readBoolean();
            char h = dis.readChar();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dis!=null){
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
