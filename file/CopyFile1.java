package io.file;

import java.io.*;

//使用字符缓冲流完成对文件的拷贝
//BufferedReader 构造方法：BufferedReader(Reader reader);
//BufferedWriter 构造方法：BufferedWriter(Writer Writer);
//特点：字符缓冲流自带有缓冲区，大小为8192个字符，也就是16KB
public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        //任务：通过字符缓冲流：将1.txt文件中的内容拷贝到2.txt文件中
        //注：1.txt在F:/IDEA/1.txt
        //1.创建字符缓冲输入流对象，关联数据源文件
        //这里我们直接使用匿名对象来构建
        BufferedReader br = new BufferedReader(new FileReader("F:/IDEA/1.txt"));
        //2.创建字符缓冲输出流对象，关联目的地文件，如果该文件不存在即会自动创建文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:/IDEA/2.txt"));
        //3.定义变量记录读取到的数据
        int len;
        //4.循环读取，只要条件满足就一直读，并将读取到的内容赋值给变量
        while((len = br.read()) != -1){
            //5.将读取到的数据写入到目的地文件中
            bw.write(len);
        }
        //6.释放资源
        br.close();
        bw.close();

    }

}
