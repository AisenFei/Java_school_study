package code_2021_0102;
//懒汉模式-单线程版,线程不安全
public class LazyMan1 {
    private static LazyMan1 instance = null;
    private LazyMan1(){}
    public static LazyMan1 getInstance(){
        return instance;
    }
}
