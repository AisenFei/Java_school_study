package code_2021_0103;

import java.util.ArrayList;
import java.util.List;

public class SequencePrint {
    public int score;
    public static void main(String[] args) {
        Thread a = new Thread(new Task("A"));
        Thread b = new Thread(new Task("B"));
        Thread c = new Thread(new Task("C"));
        c.start();
        b.start();
        a.start();
        List<SequencePrint> list = new ArrayList<>();
        list.sort((s1,s2)->s1.score - s2.score);
    }

    private static class Task implements Runnable{
        //每个线程有唯一标识字段
        private String content;
        //顺序打印的内容：可以循环打印
        private static String[] ARR = {"A","B","C"};
        private static int INDEX;//从数组哪个索引打印

        public Task(String content){
            this.content = content;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (ARR) {//三个线程使用同一把锁
                        //从数组索引位置打印，如果当前线程要打印的内容不一致，释放对象锁等待
                        //while循环防止，释放锁之后，该线程再次抢占并向下执行。
                        while (!content.equals(ARR[INDEX])) {
                            ARR.wait();
                        }
                        //如果数组要打印的内容和当前线程要打印的一致，
                        //就打印，并把数组索引切换到一个位置，通知其他线程
                        System.out.print(content);
                        if (INDEX == ARR.length - 1) {
                            System.out.println();
                        }
                        //控制下标始终在0,1,2里面循环
                        INDEX = (INDEX + 1) % ARR.length;
                        //该线程执行完了，唤醒下一个线程向下执行
                        ARR.notifyAll();
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
