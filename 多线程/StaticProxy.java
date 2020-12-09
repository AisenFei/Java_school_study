package Thread;
//共同接口
interface CommentInterface{
    public abstract void todo();
}

//真实角色
class RealityRole implements CommentInterface{
    @Override
    public void todo() {
        System.out.println("真实角色的功能");
    }
}

//代理角色
class ProxyRole implements CommentInterface{
    //持有代理角色的引用
    private CommentInterface realityRole;

    //传入一个真实角色
    public ProxyRole(CommentInterface role){
        this.realityRole = role;
    }

    @Override
    public void todo() {
        //在真实角色功能运行之前，代理角色做准备工作
        doBefore();
        //执行真实角色的功能
        realityRole.todo();
        //代理角色的首位工作
        doAfter();
    }

    private void doBefore() {
        System.out.println("准备工作");
    }

    private void doAfter() {
        System.out.println("收尾工作");
    }
}
public class StaticProxy {
    public static void main(String[] args) {
        //创建真实角色对象
        CommentInterface realityRole = new RealityRole();
        //创建代理角色对象，并传入真实对象
        ProxyRole proxyRole = new ProxyRole(realityRole);
        //代理角色工作，本质调用的还是真实角色的功能
        proxyRole.todo();
    }
    /**
     * 运行结果：
     * 准备工作
     * 真实角色的功能
     * 收尾工作
     */
}

