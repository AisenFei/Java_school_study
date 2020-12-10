package Thread;
//模拟倒计时
public class TestSleep {
    //倒计时十秒
    public static void tenDown() throws InterruptedException {
        int num = 10;
        while(num > 0){
            Thread.sleep(1000);
            System.out.println(num--);
        }
    }

    public static void main(String[] args) {
        try {
            tenDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
