package code_2021_0102;

public class BreadShop {
    private static int COUNT;

    //消费者
    public static class Consumer implements Runnable{
        @Override
        public void run() {
            try {
                while(true){
                    synchronized(BreadShop.class){
                        //库存到达下限，不能继续消费，需要阻塞等待
                        if(COUNT == 0){
                            BreadShop.class.wait();//释放对象锁
                        }else{
                            //库存>0,允许消费
                            System.out.println("消费者"+Thread.currentThread().getName()+"消费了1个面包");
                            COUNT--;
                            //通知BreadShop.class.wait();进入阻塞状态的线程
                            BreadShop.class.notifyAll();
                            //模拟消费的耗时
                            Thread.sleep(500);
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Producter implements Runnable{
        @Override
        public void run() {
            try {
                while(true){
                    synchronized(BreadShop.class){
                        if(COUNT == 10){
                            BreadShop.class.wait();
                        }else{
                            System.out.println("生产者"+Thread.currentThread().getName()+"生产了1个面包");
                            COUNT++;
                            //通知消费者可以消费了
                            BreadShop.class.notifyAll();
                            Thread.sleep(500);
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        //同时启动20个消费者线程
        Thread[] threads1 = new Thread[20];
        for(int i = 0;i < 20;i++){
            threads1[i] = new Thread(new Consumer());
        }
        for(Thread t:threads1){
            t.start();
        }

        //同时启动10个生产者线程
        Thread[] threads2 = new Thread[10];
        for(int i = 0;i < 10;i++){
            threads2[i] = new Thread(new Producter());
        }
        for(Thread t:threads2){
            t.start();
        }
    }
}
