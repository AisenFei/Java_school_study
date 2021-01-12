package code_2021_0110;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获得类的信息
public class Test10 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("code_2021_0110.User");

        //获得类的名字
        System.out.println(c1.getName());//获得包名+类名
        System.out.println(c1.getSimpleName());//获得类名

        //获得类的属性
        Field[] fields = c1.getFields();//只能找到public属性

        fields = c1.getDeclaredFields();//找到全部的属性
        for(Field field : fields){
            System.out.println(field);
        }

        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("=================");
        Method[] methods = c1.getMethods();//获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的："+method);
        }
        methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("getDeclaredMethods:"+method);
        }

        //获得指定方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName",String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得指定的构造器
        System.out.println("=================");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        constructors = c1.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println("#" + constructor);
        }

        //获得指定的构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定的构造器："+ declaredConstructor);
    }
}
