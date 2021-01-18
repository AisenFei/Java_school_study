package code_2021_0103;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFile {
    public static void main(String[] args) {
        File dir = new File("E:\\Game");
        List<File> files = listDir(dir);
        //jdk1.8集合框架使用stream操作，可以使用lambda表达式
        files.stream().forEach(System.out::println);
    }
    public static List<File> listDir(File dir){
        List<File> list = new ArrayList<>();
        if(dir.isFile()){
            list.add(dir);
        }else if(dir.isDirectory()){
            File[] children = dir.listFiles();
            if(children != null){
                for(File child:children){
                    List<File> files = listDir(child);
                    list.addAll(files);
                }
            }
        }
        return list;
    }
}
