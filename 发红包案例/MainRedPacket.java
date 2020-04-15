import java.util.ArrayList;


public class MainRedPacket {
	public static void main(String[] args){
		Manager manager = new Manager("群主",100);
		
		Member one = new Member("张三",0);
		Member two = new Member("李四",0);
		Member three = new Member("王五",0);
		
		manager.show();
		one.show();
		two.show();
		three.show();
		System.out.println("============");
		
		ArrayList<Integer> redList = manager.send(20, 3);
		//三个普通成员收红包
		one.receive(redList);
		two.receive(redList);
		three.receive(redList);
		
		manager.show();//100-20=80
		one.show();
		two.show();
		three.show();
	}
}
