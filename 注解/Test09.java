package code_2021_0110;

public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器-->根加载器（c/c++),无法直接获取，所以为null
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("code_2021_0110.Test09").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置类是谁加载的
        ClassLoader classLoader1 = Class.forName("java.util.Collections").getClassLoader();
        System.out.println(classLoader1);


    }
}
