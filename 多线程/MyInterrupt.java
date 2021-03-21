package 多线程;

public class MyInterrupt {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("我是t1，我还在执行！");
            }
            System.out.println("我是t1，我执行完了！");
        });
        Thread t2 = new Thread(()->{
            System.out.println("我是t2，我开始执行了");
            t1.interrupt();
            System.out.println("我是t2，我执行完了");
        });
        t1.start();
        t2.start();
    }
}
