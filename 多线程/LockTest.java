package code_2020_1221;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable{
    //票
    private static int ticketNums = 10;

    //定义Lock锁
    private final ReentrantLock lock = new ReentrantLock(true);
    @Override
    public void run() {
        while(true){
            lock.lock();
            try{
                if(ticketNums>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+ticketNums--);
                }else{
                    break;
                }
            }finally {
                //解锁
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        new Thread(lockTest,"小黑").start();
        new Thread(lockTest,"小红").start();
        new Thread(lockTest,"小明").start();
    }
}
