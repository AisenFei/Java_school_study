package Thread;

//创建二十个子线程，只有当子线程执行完之后，再执行main线程
public class FinallyMain {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            final int n = i;
            new Thread(()->{
                System.out.println(n);
            }).start();
        }
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println("OK");
    }
}
