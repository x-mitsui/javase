package com.IO流;

import java.io.*;

/*
    拷贝目录
 */
public class CopyAll {
    public static void main(String[] args) {
        // 拷贝源
        File srcDir = new File("res");
        // 拷贝目标
        File destDir = new File("res2");
        // 调用拷贝方法
        try {
            copyDir(srcDir, destDir);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void copyDir(File srcDir, File destDir) throws FileNotFoundException {
        if (!srcDir.exists() || !destDir.exists()) {
            throw new FileNotFoundException("源文件或目标路径为空");
        }
        File[] files = srcDir.listFiles();
        if (0 == files.length) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                String desDirName = destDir.getAbsolutePath() + "/" + file.getName();
                File temp = new File(desDirName);
                temp.mkdir();
                copyDir(file, temp);
            }
            if (file.isFile()) {
                FileInputStream fis = null;
                FileOutputStream fos = null;
                try {
                    fis = new FileInputStream(file.getAbsolutePath());
                    String outputFileName = destDir.getAbsolutePath() + "/" + file.getName();
                    File outputFile = new File(outputFileName);
                    if (!outputFile.exists()) {
                        outputFile.createNewFile();
                    }
                    fos = new FileOutputStream(outputFileName);
                    // 一边读一边写
                    byte[] readBytes = new byte[1024 * 1204];//一次最多拷贝1MB
                    int readCount = 0;
                    while ((readCount = fis.read(readBytes)) != -1) {
                        fos.write(readBytes, 0, readCount);
                    }
                    fos.flush();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
