package p02_test.demo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

//练习,实现多线程图片下载
public class TestThread extends Thread {

}

class WebDownloader{
    // 下载方法
    public void downloader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常");
        } finally {
        }
    }
}
