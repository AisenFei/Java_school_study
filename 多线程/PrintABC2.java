package code_2021_0102;

public class PrintABC2 {
    public static class Print implements Runnable{
        private String name;
        private Object prev;
        private Object self;

        public Print(String name,Object prev,Object self){
            this.name = name;
            this.prev = prev;
            this.self = self;
        }
        @Override
        public void run() {
            int count = 10;
            while(count > 0){
                synchronized (prev){
                    synchronized (self){
                        System.out.print(this.name);
                        count--;
                        if("C".equals(name)){
                            System.out.println();
                        }
                        self.notifyAll();
                    }
                    try {
                        if(count == 0){
                            prev.notifyAll();
                        }else{
                            prev.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Print printA = new Print("A",c,a);
        Print printB = new Print("B",a,b);
        Print printC = new Print("C",b,c);

        new Thread(printA).start();
        Thread.sleep(100);
        new Thread(printB).start();
        Thread.sleep(100);
        new Thread(printC).start();
    }
}
