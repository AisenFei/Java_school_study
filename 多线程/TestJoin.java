package Thread;

//测试join方法
public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程VIP来了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        //主线程执行代码
        for(int i = 0;i < 500;i++){
            if(i == 200){
                thread.join();//插队
            }
            System.out.println("main"+i);
        }
    }
    //当主线程跑到200时，只能等待线程VIP跑完，才能继续执行。
}
