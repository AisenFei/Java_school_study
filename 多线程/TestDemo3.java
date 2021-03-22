package 多线程;

class Sync{
    public void test(){
        synchronized (Sync.class) {
            System.out.println("test方法开始，当前线程为" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test方法结束，当前线程为" + Thread.currentThread().getName());
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        Sync sync = new Sync();
        sync.test();
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Class c = Sync.class;
        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread2();
            thread.start();
        }
    }
}
