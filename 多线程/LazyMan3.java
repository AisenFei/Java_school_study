package code_2021_0102;
//懒汉模式-多线程版-双重检验-性能高
public class LazyMan3 {
    private static volatile LazyMan3 instance = null;
    private LazyMan3(){}
    public static LazyMan3 getInstance(){
        if(instance == null){
            synchronized (LazyMan3.class){
                if(instance == null){
                    instance = new LazyMan3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(getInstance());
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for(Thread t:threads){
            t.start();
        }
    }
}
