package code_2021_0110;
//饿汉式单例
public class Hungry {

    //假如我们里面有这些代码，是不是就很浪费空间呢
    private byte[] data1 = new byte[1024*1024];
    private byte[] data2 = new byte[1024*1024];
    private byte[] data3 = new byte[1024*1024];
    private byte[] data4 = new byte[1024*1024];

    //刚进饭馆就要菜，现成的
    private static Hungry instance = new Hungry();
    private Hungry(){}
    public static Hungry getInstance(){
        return instance;
    }
}
