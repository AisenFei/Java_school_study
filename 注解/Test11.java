package code_2021_0110;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态的创建对象，通过反射
public class Test11 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("code_2021_0110.User");

        //构造一个对象
        User user = (User)c1.newInstance();//本质是调用了类的无参构造器
        System.out.println(user);

        //通过构造器创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user1 = (User)declaredConstructor.newInstance("用户",001,18);
        System.out.println(user1);

        //通过反射调用普通方法
        User user2 = (User)c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke:激活
        //(对象，“方法的值”）
        setName.invoke(user2,"哈哈");
        System.out.println(user2.getName());

        //通过反射操作属性
        System.out.println("=================================");
        User user3 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");

        //不能直接操作私有属性，需要关闭程序的安全监测，属性或方法的setAccessible(true).
        name.setAccessible(true);//默认是false的,修改为true
        name.set(user3,"嘿嘿");
        System.out.println(user3.getName());

    }
}
