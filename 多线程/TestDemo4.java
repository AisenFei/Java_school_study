package 多线程;

public class TestDemo4 {
    private static Object object = new Object();
    public synchronized void foo(){
        System.out.println("hello Thread");
    }
    public static void main(String[] args) {
        synchronized (object){
            System.out.println("hello world");
        }
        TestDemo4 t = new TestDemo4();
        t.foo();
    }
}
