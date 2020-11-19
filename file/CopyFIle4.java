package io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*FileInputStream:
*       成员方法：
*       public int read(byte[] bys);
*       一次读取一个字节数组，将读取到的内容存入到数组中
*       并返回读取到的有效字节数，读不到返回-1
* FileOutputStream:
*       成员方法：
*       public void write(byte[] bys,int index,int len);
*       一次写入一个指定的字节数组*/
public class CopyFIle4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:/IDEA/1.jpg");
        FileOutputStream fos = new FileOutputStream("F:/IDEA/2.jpg");
        byte[] bys = new byte[2048];//这里创建字节数组时最好将大小定为1024的整数倍
        int len;
        while((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }
}
