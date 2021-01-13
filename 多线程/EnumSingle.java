package code_2021_0110;
//枚举式，enum本身也是一个Class类
public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }
}
