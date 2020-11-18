package io.file;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //任务：将F:\IDEA\1.txt 封装成File对象
        //构造方法一：
        //路径赋值过来之后，发现\变成了\\,因为\有特殊含义，所以需要前面加\来转义一下
        File file1 = new File("F:\\IDEA\\1.txt");
        //如果觉得写两个右斜线太麻烦，那么就可以写一个左斜线来代替
        File file2 = new File("F:/IDEA/1.txt");
        System.out.println("file1:" + file1);

        //构造方法二：
        File file3 = new File("F:/IDEA/","1.txt");
        System.out.println("file3:" + file3);

        //构造方法三：
        File fileParent = new File("F:/IDEA/");
        File fileChild = new File(fileParent,"1.txt");
        System.out.println("fileChild:" + fileChild);

        //任务：在F:/IDEA/目录下创建文件
        File file4 = new File("F:/IDEA/2.txt");
        /*调用file4的成员方法createNewFile()
         此时要注意创建file4对象时，有可能我们输入的路径本身就是错误的，
         然而编写代码的时候编译器又无法识别，所以在使用对象调用方法时就有可能出现异常IOException
        那么这个时候就需要我们去处理这个异常，可以选择捕获或者抛出，这里我们选择抛出。*/
        boolean flag1 = file4.createNewFile();
        System.out.println("file5:"+flag1);

        //任务：在F:/IDEA/下创建目录,也就是文件夹abc
        File file5 = new File("F:/IDEA/abc");
        boolean flag2 = file5.mkdir();
        System.out.println("flag2:"+flag2);

        //任务：在刚才创建的abc下继续创建子目录/d/e(多级目录)
        File file6 = new File("F:/IDEA/abc/b/c");
        boolean flag3 = file6.mkdirs();
        System.out.println("flag3" + flag3);

        //任务：判断File7对象是否为目录
        File file7 = new File("F:/IDEA/abc/b/c");
        boolean flag4 = file7.isDirectory();
        System.out.println("flag4"+flag4);

    }
}
