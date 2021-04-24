package Java8新特性.函数式接口;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestFunctional {
    @Test
    public void test1(){
        //消费型接口
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s+"光吃不吐！");
            }
        };
        con1.accept("消费型接口");
        Consumer<String> con2 = s -> System.out.println(s+"只负责消费");
        con2.accept("消费型接口");
        //供给型接口
        Supplier<String> sup1 = new Supplier<String>() {
            @Override
            public String get() {
                return "供给型接口只负责生产";
            }
        };
        System.out.println(sup1.get());
        Supplier<String> sup2 = () -> "供给型接口只负责生产";
        System.out.println(sup2.get());

        //函数型接口，一一对应
        Function<Integer,Integer> fun1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer+10;
            }
        };
        System.out.println(fun1.apply(5));
        Function<Integer,Integer> fun2 = x -> x+10;
        System.out.println(fun2.apply(5));

    }
}
