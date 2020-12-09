package Thread;
//创建线程方式2：实现Runnable接口，重写run()方法
//              执行线程需要丢入Runnable接口实现类，调用start方法
public class TestThread2 implements Runnable{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码--"+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        TestThread2 testThread2 = new TestThread2();
        //创建线程对象，通过线程对象来开启我们的线程，代理
        //Thread thread = new Thread(testThread2);
        //thread.start();
        //简写，可以直接创建一个匿名对象来调用start()方法
        new Thread(testThread2).start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程--"+i);
        }
    }
}
