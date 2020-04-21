package cn.JavaSE.day01;

public class DemoMain {

    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usbMouse = new Mouse();
        //参数时USB类型，正好传进去的就是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数时USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//正确写法


        computer.powerOff();
    }
}
