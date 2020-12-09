package Thread;

//多个线程同时操作同一个对象
//买火车票的例子

//发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class TestThread3 implements Runnable{
    //票数
    private int ticketNums = 10;

    @Override
    public void run() {
        while(true){
            if(ticketNums <= 0){
                break;
            }
            //CPU的处理速度太快，使用Thread.sleep模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第" + ticketNums--+"票");
        }
    }

    public static void main(String[] args) {

        TestThread3 ticket = new TestThread3();

        new Thread(ticket,"小红").start();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小黑").start();
    }
}
