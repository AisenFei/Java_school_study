package annotation;

import java.lang.annotation.*;
//测试元注解
public class Test02 {
    @MyAnnotation
    public void test(){

    }
}
//定义一个注解
//Target表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})

//Retention 表示注解在什么地方还有效
@Retention(value = RetentionPolicy.RUNTIME)

//Documented 表示是否将我们的注解生成在JAVADOC中
@Documented

//Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
