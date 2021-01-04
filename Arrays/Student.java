package code_2021_0104;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;//姓名
    private int hight;//身高

    public Student(String name, int hight) {
        this.name = name;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hight=" + hight +
                '}';
    }

    @Override
    public int compareTo(Student stu) {
        if(this.hight == stu.hight){
            return 0;
        }else if(this.hight > stu.hight){
            return 1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        List<Student> stus = new ArrayList<>();
        Student stu1 = new Student("张三",177);
        Student stu2 = new Student("李四",160);
        Student stu3 = new Student("王五",182);
        Student stu4 = new Student("赵六",165);

        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        stus.add(stu4);

        Collections.sort(stus);
        for(Student s : stus){
            System.out.println(s);
        }
    }
}
