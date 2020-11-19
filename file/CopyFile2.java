package io.file;

import java.io.*;

//BufferedReader 中的成员方法：
//             public String readLine();一次读取一行数据并返回读取到的内容，读不到返回null
//BufferedWriter 中的成员方法：
//              public void newLine();根据当前操作系统给出对应的换行符
public class CopyFile2 {
    public static void main(String[] args) throws IOException {
        //以一次一行的方式，将1.txt文件中的内容拷贝到2.txt中
        BufferedReader br = new BufferedReader(new FileReader("F:/IDEA/1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:/IDEA/2.txt"));
        String str;
        while((str = br.readLine()) != null){
            bw.write(str);
            //千万要注意，要自己补充换行符
            bw.newLine();
        }
        br.close();
        bw.close();
    }

}
