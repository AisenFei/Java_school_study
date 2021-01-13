package code_2021_0110;

import java.lang.reflect.Constructor;

//反射破解双重校验锁
public class Lazy2 {
    private Lazy2(){}
    private volatile static Lazy2 instance = null;

    public static Lazy2 getInstance(){
        if(instance == null){
            synchronized (Lazy2.class){
                if(instance == null){
                    instance = new Lazy2();
                }
            }
        }
        return instance;
    }
    //反射破解
    public static void main(String[] args) throws Exception {
        //用单例模式创建对象
        Lazy2 instance = Lazy2.getInstance();
        //通过反射获取构造器
        Constructor<Lazy2> declaredConstructor = Lazy2.class.getDeclaredConstructor(null);
        //消除构造器权限检验
        declaredConstructor.setAccessible(true);
        //构造对象
        Lazy2 instance1 = declaredConstructor.newInstance();

        //通过两个对象的hashCode值来对比是否为同一对象
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
