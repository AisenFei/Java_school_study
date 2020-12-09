package Thread;

interface Hello{
    void sayHello(int n);
}
public class TestLambda2 {
    public static void main(String[] args) {
        //1.使用lambda表达式
        Hello hello = (int a)->{
            System.out.println("hello lambda-->"+a);
        };
        hello.sayHello(1);

        //简化1.参数类型
        hello = (a)->{
            System.out.println("hello lambda-->"+a);
        };
        hello.sayHello(2);

        //简化2.简化括号
        //接口方法中只有一个参数时可以去掉(),否则得加上
        hello = a->{
            System.out.println("hello lambda-->"+a);
        };
        hello.sayHello(3);

        //简化3.去掉花括号
        //lambda表达式只能有一行代码的情况下下才能简化成为一行，如果有多行，那么久用代码块包裹。
        hello = a-> System.out.println("hello lambda-->"+a);
        hello.sayHello(4);
    }
}
