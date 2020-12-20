package Thread;

public class SynchronizedTest {

    private static int COUNT;

    private static void increment(){
        COUNT++;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (SynchronizedTest.class){
                        increment();
                    }
                }
            }).start();
        }

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    increment();
                }
            }).start();
        }
    }
}
