package io.file;

/*FileInputStream:
      构造方法：
      public FileInputStream(String pathname);
      成员方法：
      public int read():一次读取一个字节，并返回读取到的内容，读不到返回-1
  FileOutoutStream:
      构造方法：
      public FileOutputStream(String pathname);
      成员方法：
      public void write(int len):一次写入一个字节*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:/IDEA/1.jpg");
        FileOutputStream fos = new FileOutputStream("F:/IDEA/2.jpg");
        int len;
        while((len = fis.read()) != -1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}
