package code_2021_0110;
//性能分析
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Test12 {
    //普通方式调用
    public static void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法执行10亿次："+(endTime-startTime)+"ms");
    }

    //反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getname = c1.getDeclaredMethod("getName",null);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getname.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次："+(endTime-startTime)+"ms");
    }

    //反射方式关闭检测后
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getname = c1.getDeclaredMethod("getName",null);
        getname.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getname.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("关闭检测执行10亿次："+(endTime-startTime)+"ms");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }
}
