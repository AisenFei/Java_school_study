package 多线程;

class MyThread1 implements Runnable{
    private int ticket = 1000;
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.sale();
        }
    }
    public synchronized void sale(){
        if(this.ticket > 0){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"还有"+this.ticket-- +"张票");
        }
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        Thread t1 = new Thread(mt,"黄牛A");
        Thread t2 = new Thread(mt,"黄牛B");
        Thread t3 = new Thread(mt,"黄牛C");
        t1.start();
        t2.start();
        t3.start();
    }
}
