package com.it;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterTest {
    //1.read()的理解，返回读入的一个字符。如果达到文件末尾，返回-1
    //2.异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
    @Test
    public void testFileReader(){
        FileReader fr = null;
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("file\\hello.txt");
            //2.提供具体的流
            fr = new FileReader(file);

            //3.数据的读入
            //read():返回读入的一个字符。如果达到文件末尾，返回-1
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.流的关闭操作
            try {
                if(fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //对read()操作升级：使用read的重载方法
    //read(char[] cbuf):返回每次读入cbuf数组中的字符的个数。如果达到文件末尾，返回-1
    @Test
    public void testFileReader1(){
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("file\\hello.txt");
            //2.FileReader流的实例化
            fr = new FileReader(file);
            //3.读入的操作
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.资源的关闭
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
