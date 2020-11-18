package io.tom;

public abstract class Person {
    private String name; // 姓名
    private Integer age; //年龄
    private String gender; //性别

    //一系列的getter 和setter 方法
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
