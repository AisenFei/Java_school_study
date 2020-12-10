package Thread;

//测试礼让线程
class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->start");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"-->end");
    }
}
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();
        new Thread(myYield,"c").start();
    }
}
