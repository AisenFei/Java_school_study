package code_2021_0314;

class Pen{
    private String pen = "笔";
    public String getPen(){
        return pen;
    }
}
class Book{
    private String book = "本";
    public String getBook(){
        return book;
    }
}
public class DeadLock {
    private static Pen pen = new Pen();
    private static Book book = new Book();
    public static void main(String[] args){
        new DeadLock().deadLock();
    }
    public void deadLock(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (pen){
                    System.out.println(Thread.currentThread()+"我有笔，我就不给你");
                    synchronized (book){
                        System.out.println(Thread.currentThread()+"把你的笔给我");
                    };
                }
            }
        },"Pen");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (book){
                    System.out.println(Thread.currentThread()+"我有本子，我就不给你");
                    synchronized (pen){
                        System.out.println(Thread.currentThread()+"把你的本给我");
                    };
                }
            }
        },"book");
        thread1.start();
        thread2.start();
    }
}
