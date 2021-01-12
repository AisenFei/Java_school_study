package code_2021_0110;

//懒汉式-双重校验锁
public class Lazy1 {
    private volatile static Lazy1 instance = null;
    private Lazy1(){}
    private static Lazy1 getInstance(){
        if(instance == null){
            synchronized (Lazy1.class){
                if(instance == null){
                    instance = new Lazy1();
                }
            }
        }
        return instance;
    }
}
