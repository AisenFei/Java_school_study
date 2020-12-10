package Thread;

//观察测试线程状态
public class TestState {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{//使用lambda表达式
            for(int i = 0;i < 5;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("-----------");
        });

        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state);//NEW

        //启动后
        thread.start();
        state = thread.getState();
        System.out.println(state);//RUN

        while(state != Thread.State.TERMINATED){//只要线程不终止，就一直输出状态
            Thread.sleep(100);
            state = thread.getState();//更新线程状态
            System.out.println(state);
        }
    }
}
