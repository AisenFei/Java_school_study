package io.tom;

public class Test5_Tom {

    public interface Teacher{ //定义了一个老师的接口
        void teach();
    }

    public interface Driver { //定义了一个司机的接口
        void driver();
    }

    public interface SpySkills {  //定义了一个间谍的接口
        void stealInfo();   //窃取信息
        void cracklingPassword();   // 会破解密码
    }


//定义间谍对象 继承Person 类 实现上述接口

    public static class Spy extends Person implements SpySkills,Driver,Teacher{

        //覆写方法

        @Override
        public void teach() {
            System.out.println("Teaching Geography ....");
        }

        @Override
        public void driver() {
            System.out.println("Driving for escape ....");
        }

        @Override
        public void cracklingPassword() {
            System.out.println("Cracking passwords....");
        }

        @Override
        public void stealInfo() {
            System.out.println("Stealing information...");
        }

    }


    public static void main(String[] rags ){
        Person person = new Spy();
        person.setName("Tom");
        person.setAge(20);
        person.setGender("M");

        if(person instanceof SpySkills ){ //如果此人是一个间谍，并且学会了所有的技能
            SpySkills spy = (SpySkills) person; //强制转型成为间谍
            spy.stealInfo(); // 窃取信息
            spy.cracklingPassword(); // 破解密码
        }

        if(person instanceof Driver) {
            Driver driver = (Driver) person;  //强制转型成为间谍
            driver.driver(); // 飙车躲避追杀
        }

        if(person instanceof Teacher) {
            Teacher teacher = (Teacher) person; //强制转型成为老师
            teacher.teach(); //教学避免怀疑
        }

    }
}
