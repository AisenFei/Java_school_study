package code_2021_0102;

//单例模式--饿汉模式
public class HungaryMan {
    private static HungaryMan instance = new HungaryMan();
    private HungaryMan(){}
    public static HungaryMan getInstance(){
        return instance;
    }
}
