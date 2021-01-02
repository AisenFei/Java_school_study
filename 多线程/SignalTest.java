package lesson6;

public class SignalTest {
    public static void main(String[] args) throws InterruptedException {
        //竞争class 对象锁
        synchronized (SignalTest.class) {
          /*  //1.当前线程释放对象锁 -- 花括号还没有结束的时候，自己的代码释放
              //2.当前线程进入阻塞态
            SignalTest.class.wait();  // 之后的代码还执行吗？？?
            //这个代码必须加锁 不然会抛出一个java.lang.IllegalMonitorStateException*/

            //通知调用同一个对象的wait() 阻塞的线程 --唤醒操作，唤醒后竞争对象锁
            SignalTest.class.notify();
        } // 释放对象锁

    }
}
