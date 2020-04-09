import java.util.ArrayList;

//定义以指定格式打印集合的方法(ArrayList类型作为参数),使用{}括起来，使用@分隔每个元素
//格式参照{元素@元素@元素@元素}
public class Demo02ArrayListPrint {
	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("高飞");
		list.add("吴欣洋");
		list.add("马家驹");
		list.add("黑子");
		
		print1(list);
	}
	
	public static void print1(ArrayList<String> list){
		System.out.print("{");
		for(int i = 0; i < list.size(); i++){
			if(i == list.size()-1){
				System.out.print(list.get(i) + "}");
			}
			else{
				System.out.print(list.get(i) + "@");
			}
			
		}
	}
}
