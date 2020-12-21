package code_2020_1221;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Test03 {
    //注解可以显示复制，如果没有默认值，就必须给注解赋值
    @MyAnnotation2(name = "哈哈",schools = {"西北大学","清华大学"})
    public void test(){}

    //如果注解只有一个值，那么可以省略,直接使用默认
    @MyAnnotation3("")
    public void test2(){}
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数：参数类型 参数名();
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1,代表不存在

    String[] schools();
}
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}
