package Thread;

//启动三个线程分别为a、b、c，且执行顺序为c，b，a
public class PrintCBA {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread a = new Thread(r,"a");
        Thread b = new Thread(r,"b");
        Thread c = new Thread(r,"c");
        Thread[] threads = new Thread[]{c,b,a};
        for(Thread t : threads){
            t.start();
            t.join();
        }
    }
}
