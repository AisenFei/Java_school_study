package cn.JavaSE.use_jdk;

public class Person {
    String name;
    int age;
    int height;
    int weight;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
