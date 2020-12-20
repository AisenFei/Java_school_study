package Thread;

public class UnsafeThread {
    static int COUNT = 0;
    //有一个变量COUNT=0，同时启动20个线程，每个线程循环1000次，每次循环COUNT++
    //等待20个子线程执行完毕之后，在main线程打印COUNT（预期）
    public static void main(String[] args) throws InterruptedException {
        //尽量同时启动，不让new Thread耗时影响
        Thread[] threads = new Thread[20];
        for(int i = 0;i < 20;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0;j < 1000;j++){
                        COUNT++;
                    }
                }
            });
        }
        for(Thread t : threads){
            t.start();
        }
        for(Thread t : threads){
            t.join();
        }
        System.out.println(COUNT);
    }
}
