package p03_Runnable接口.demo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习,实现多线程图片下载
public class TestThread extends Thread {
    private String _url; //网络图片地址
    private String _name; //保存文件地址

    public TestThread(String url, String name) {
        this._url = url;
        this._name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(this._url, this._name);
        System.out.println("下载文件"+this._name);
    }

    public static void main(String[] args) {
        TestThread testThread1 = new TestThread("https://img0.baidu.com/it/u=3399903401,3429099419&fm=26&fmt=auto&gp=0.jpg","1.jpg");
        TestThread testThread2 = new TestThread("https://img0.baidu.com/it/u=3850210309,264895298&fm=253&fmt=auto&app=120&f=JPEG?w=667&h=500","2.jpg");
        TestThread testThread3 = new TestThread("https://img1.baidu.com/it/u=795196589,2407743860&fm=26&fmt=auto&gp=0.jpg","3.jpg");

        // 每次执行打印日志都不同
        testThread1.start();
        testThread2.start();
        testThread3.start();


    }
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
