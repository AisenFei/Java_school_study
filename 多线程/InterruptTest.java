package Thread;

public class InterruptTest {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(i+":"+Thread.interrupted());
                }
            }
        });
        t.start();
        System.out.println("t start");
        t.interrupt();
        System.out.println("t stop");
    }
}
