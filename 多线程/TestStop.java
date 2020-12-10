package Thread;

//测试强制停止线程
public class TestStop implements Runnable{
    //1.设置一个标志位
    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run....Thread"+i++);
        }
    }
    //2.设置一个公开的方法停止线程，转换标志位
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if(i == 666){
                //调用自己写的公开stop方法切换标志位，让线程停止
                testStop.stop();
                System.out.println("该线程停止了");
            }
        }
    }
}
