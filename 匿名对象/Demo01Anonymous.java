//匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
public class Demo01Anonymous {
	public static void main(String[] args){
		//创建对象的标准格式：
		Person one = new Person();
		one.name = "高飞";
		one.showName();
		System.out.println("=============");
		
		//匿名对象
		new Person().name = "吴欣洋";
		new Person().showName();//我叫:null
	}
}
