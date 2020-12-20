package Thread;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

public class SynchronizedTest2 {
    /**
     * 有一个教室，座位有50个，同时又三个老师安排同学的座位
     * 每个老师安排100个同学到这个教室，模拟使用多线程实现
     * 三个线程同时启动来安排同学，直到座位坐满
     */
    private static int SITCOUNT = 50;
    private static int STUCOUNT = 100;

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    while(SITCOUNT > 0){
                        System.out.println(Thread.currentThread().getName()+"老师安排"+SITCOUNT--+"号学生坐下");
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(r,"郑").start();
        new Thread(r,"高").start();
        new Thread(r,"陈").start();
    }
}
