package code_2020_1221;

//测试生产者消费者问题2
//信号灯法：标志位
public class TestPC2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}

//生产者-->演员
class Player extends Thread{
    TV tv;
    public Player(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.tv.play("天天向上");
        }
    }
}

//消费者-->观众
class Watcher extends Thread{
    TV tv;
    public Watcher(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}
//产品-->电影
class TV{
    //演员拍戏，观众等待
    //观众观看，演员等待
    String movie;
    boolean flag = true;
    //拍戏
    public synchronized void play(String movie){
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("新电影:"+movie);
        //通知观众观看
        this.notifyAll();
        this.movie = movie;
        this.flag = false;
    }
    //观看
    public synchronized void watch(){
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观看了:"+movie);
        //通知演员拍戏
        this.notifyAll();
        this.flag = true;
    }
}
