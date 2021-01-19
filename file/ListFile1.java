package code_2021_0119;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFile1 {

    public static void main(String[] args) {
        File dir = new File("E:\\Game");
        List<File> files = listDir2(dir);
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

    public static List<File> listDir2(File dir){
        List<File> list = new ArrayList<>();
        //获取目录下一级的子文件、子文件夹
        File[] children = dir.listFiles();
        if (children != null) {
            for (File child : children) {
                list.add(child);
                if (child.isDirectory()) {
                    list.addAll(listDir2(child));
                }
            }
        }
        return list;
    }
}
