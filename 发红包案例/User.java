//�û���
public class User {
	
	private String name;//����
	private int money;//��Ҳ���ǵ�ǰ�û�ӵ�е�Ǯ��
	
	//�޲ι���
	public User(){
		
	}
	
	public User(String name,int money){
		this.name = name;
		this.money = money;
	}
	
	public void show(){
		System.out.println("�ҽУ�" + name + "�����ж���Ǯ��" + money);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	
}
