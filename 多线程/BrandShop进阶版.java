package lesson6;
/**
 * 面包店
 * 10个生产者，每个每次生产3个
 * 20个消费者，每个每次消费1个
 * 升级版需求：面包师傅每个最多生产30次：
 *            消费者不再一直消费，把生产者生产完的面包消费完，就结束
 * 隐藏信息：面包店每天生产面包的最大数量：面包店每天生产10*30*3=900个面包
 *          消费者，把900个面包消费完结束
 */
public class BrandShop进阶版 {
    /**
     * 消费者数量
     */
    private static int 消费者数量 = 10;
    /**
     * 每次消费的面包数
     */
    private static int 每次消费的面包数 = 5;
    /**
     * 生产者数量
     */
    private static int 生产者数量 = 5;
    /**
     * 生产者生产次数
     */
    private static int 生产次数 = 10;

    /**
     * 每次生产的面包数
     */
    private static int 每次生产的面包数 = 3;
    /**
     * 最大库存数
     */
    private static int 最大库存数 = 100;

    /**
     * 面包店库存
     */
    private static int 面包店库存;

    /**
     * 面包店生产面包的总数，不会消费
     */
    private static int 生产面包的总数;

    /**
     * 消费者
     */
    public static class Consumer implements Runnable{

        private String name;

        public Consumer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            //一直消费
            try {
                while (true){
                    synchronized (BrandShop进阶版.class){
                        if(生产面包的总数 == 生产者数量 * 生产次数 * 每次生产的面包数){
                            break;
                        }
                        //库存到达下限，不能继续消费，需要阻塞等待
                        if(面包店库存 - 每次消费的面包数 < 0){
                            BrandShop进阶版.class.wait();//释放对象锁
                        }else {
                            //库存满足消费条件，允许消费
                            面包店库存 -= 每次消费的面包数;
                            System.out.printf("消费者 %s 消费了%s个面包, 库存%s\n", name, 每次消费的面包数, 面包店库存);
                            //通知BreadShop.class.wait();代码进入阻塞的线程
                            BrandShop进阶版.class.notifyAll();
                            //模拟消费的耗时
                            Thread.sleep(200);
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //生产者
    public static class Producer implements Runnable{

        private String name;

        public Producer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                //达到生产次数
                for (int i = 0; i< 生产次数; i++){
                    synchronized (BrandShop进阶版.class){
                        //库存到达上限，不能继续生产，需要阻塞等待
                        while(面包店库存 + 每次生产的面包数 > 最大库存数){
                            BrandShop进阶版.class.wait();//释放对象锁
                        }
                        面包店库存 += 每次生产的面包数;
                        生产面包的总数 += 每次生产的面包数;
                        //库存满足生产条件
                        System.out.printf("生产者 %s 生产了%s次, 库存%s, 生产的数量%s\n", name, i+1, 面包店库存, 生产面包的总数);
                        //通知BreadShop.class.wait();代码进入阻塞的线程
                        BrandShop进阶版.class.notifyAll();
                        //模拟消费的耗时
                        Thread.sleep(200);
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //同时启动消费者线程
        Thread[] consumers = new Thread[消费者数量];
        for(int i = 0; i< 消费者数量; i++){
            consumers[i] = new Thread(new Consumer(String.valueOf(i)));
        }
        //同时启动10个生产者线程
        Thread[] producers = new Thread[生产者数量];
        for(int i = 0; i< 生产者数量; i++){
            producers[i] = new Thread(new Producer(String.valueOf(i)));
        }

        for(Thread t : consumers){
            t.start();
        }
        for(Thread t : producers){
            t.start();
        }
    }

}

