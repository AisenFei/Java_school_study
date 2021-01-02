package code_2021_0102;
//懒汉模式--多线程版-性能低
public class LazyMan2 {
    private static LazyMan2 instance = null;
    private LazyMan2(){}
    public synchronized static LazyMan2 getInstance(){
        if(instance == null){
            instance = new LazyMan2();
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
