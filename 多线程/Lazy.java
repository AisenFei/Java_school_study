package code_2021_0110;

//懒汉式单例,多线程版本
public class Lazy {
    //先做好准备，啥时候想吃再做。
    private static Lazy instance = null;
    private Lazy(){
        System.out.println(Thread.currentThread().getName()+"ok");
    }
    public static synchronized Lazy getInstance(){
        //饿了，发现没菜，没事不着急，慢慢做。
        if(instance == null){
            instance = new Lazy();
        }
        //做好了，上菜。
        return instance;
    }

    //多线程下是不安全的
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                Lazy.getInstance();
            }).start();
        }
    }
}
