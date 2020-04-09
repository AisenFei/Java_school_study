import java.util.ArrayList;

/*
 * ArrayList当中的常用方法有：
 * 
 * public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致,返回值代表添加是否成功
 * public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
 * public E remove(int index):从集合当中删除元素，参数时索引编号，返回值就是被删除掉的元素
 * public int size():从获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class Demo03ArrayListMethod {
	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list);//[]
		
		//向集合中添加元素：add
		boolean success = list.add("高飞");
		System.out.println(list);//[高飞]
		System.out.println("添加的动作是否成功：" + success);// ture
		
		list.add("吴欣洋");
		list.add("马家驹");
		list.add("黑子");
		list.add("胖子");
		list.add("勇");
		System.out.println(list);
		
		//从集合中获取元素：get,索引值从0开始
		String name = list.get(2);
		System.out.println("第2号索引位置" + name);
		
		//从集合当中删除元素：remove,索引值从0开始
		String whoRemoved = list.remove(3);
		System.out.println("被删除的人是：" + whoRemoved);
		System.out.println(list);
		
		//获取集合的长度尺寸，也就是其中元素的个数
		int size = list.size();
		System.out.println("集合的长度是：" + size);
		
	}

}
