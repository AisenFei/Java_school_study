package code_2021_0104;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;//员工姓名
    private int Salary;//月工资

    public Employee(String name, int salary) {
        this.name = name;
        this.Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("张三",5000);
        Employee emp2 = new Employee("李四",6000);
        Employee emp3 = new Employee("王五",4500);
        Employee emp4 = new Employee("赵六",8000);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        /*Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.Salary == o2.Salary){
                    return 0;
                }else if(o1.Salary > o2.Salary){
                    return -1;
                }else{
                    return 1;
                }
            }
        });*/
        //使用lambda表达式
        /*Collections.sort(list,(o1,o2)->{
            if(o1.Salary == o2.Salary){
                return 0;
            }else if(o1.Salary > o2.Salary){
                return -1;
            }else{
                return 1;
            }
        });*/
        //使用lambda表达式，并利用compare返回值特性更简化。
        Collections.sort(list,((o1, o2) -> (o2.Salary - o1.Salary)));
        for(Employee e:list){
            System.out.println(e);
        }
    }
}
