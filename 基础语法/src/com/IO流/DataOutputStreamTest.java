package com.IO流;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream: 数据专属的流
 * 这个流可以将数据连同数据的类型一并写入
 * 注意: 这个文件不是普通文本文档(这个文件用记事本打不开)
 */
public class DataOutputStreamTest {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("res/DataOutputStreamTest"));
            byte a =100;
            short b = 200;
            int c =300;
            long d =400l;
            double e = 3.14;
            float f = 4.0f;
            boolean g = true;
            char h = 'k';
            // 写, 把数据以及数据的类型一并写入到文件
            dos.writeByte(a);
            dos.writeShort(b);
            dos.writeInt(c);
            dos.writeLong(d);
            dos.writeDouble(e);
            dos.writeFloat(f);
            dos.writeBoolean(g);
            dos.writeChar(h);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dos!=null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
