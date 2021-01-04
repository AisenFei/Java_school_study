package code_2021_0104;

import java.util.Arrays;

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
public class ArraysSort3 {
    public static void main(String[] args) {
        Person[] peoples = new Person[]{
                new Person("张三",17),
                new Person("李四",32),
                new Person("王五",12),
                new Person("赵六",10),
                new Person("哈哈",23)
        };
        System.out.println("排序前：");
        for(Person p : peoples){
            System.out.println(p);
        }
        System.out.println("排序后：");
        Arrays.sort(peoples);
        for(Person p : peoples){
            System.out.println(p);
        }
    }
}
