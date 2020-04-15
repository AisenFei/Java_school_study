import java.util.ArrayList;
import java.util.Random;

//普通用户
public class Member extends User{
	//无参构造
	public Member(){
		
	}
	
	public Member(String name,int money){
		super(name,money);
	}
	
	public void receive(ArrayList<Integer> list){
		//从多个红包当中随机抽取一个
		//随机获取一个集合当中的索引编号
		int index = new Random().nextInt(list.size());
		//根据索引，从集合当中删除，并且得到被删除的红包
		int delta = list.remove(index);
		//当前成员自己本来有多少钱
		int money = super.getMoney();
		//收到红包之后的钱数
		super.setMoney(money + delta);
	}
}
