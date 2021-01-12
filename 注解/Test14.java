package code_2021_0110;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Test14 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("code_2021_0110.People");
        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        
        //获得注解的value值
        Table1 table = (Table1)c1.getAnnotation(Table1.class);
        String value = table.value();
        System.out.println(value);

        //获得类指定的注解
        Field f = c1.getDeclaredField("name");
        Field1 annotation = f.getAnnotation(Field1.class);
        System.out.println(annotation.colName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}

@Table1("db_People")
class People{

    @Field1(colName = "de_id",type = "int",length = 10)
    private int id;
    @Field1(colName = "de_age",type = "int",length = 10)
    private int age;
    @Field1(colName = "de_name",type = "varchar",length = 3)
    private String name;

    public People(){}

    public People(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table1{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Field1{
    String colName();
    String type();
    int length();
}
