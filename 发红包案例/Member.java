import java.util.ArrayList;
import java.util.Random;

//��ͨ�û�
public class Member extends User{
	//�޲ι���
	public Member(){
		
	}
	
	public Member(String name,int money){
		super(name,money);
	}
	
	public void receive(ArrayList<Integer> list){
		//�Ӷ��������������ȡһ��
		//�����ȡһ�����ϵ��е��������
		int index = new Random().nextInt(list.size());
		//�����������Ӽ��ϵ���ɾ�������ҵõ���ɾ���ĺ��
		int delta = list.remove(index);
		//��ǰ��Ա�Լ������ж���Ǯ
		int money = super.getMoney();
		//�յ����֮���Ǯ��
		super.setMoney(money + delta);
	}
}
