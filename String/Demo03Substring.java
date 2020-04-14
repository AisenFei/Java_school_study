/*
 * 字符串的截取方法：
 * public String substring(int index):截取从参数为止一直到字符串末尾，返回新字符串
 * public String substring(int begin,int end)：截取从begin开始。一直到end结束，中间的字符串
 * 备注：[begin,end),左闭右开
 */
public class Demo03Substring {
	
	public static void main(String[] args){
		String str1 = "HelloWorld";
		String str2 = str1.substring(5);
		System.out.println(str1);//HelloWorld
		System.out.println(str2);//World,新的字符串
		System.out.println("===========");
		
		String str3 = str1.substring(4,7);
		System.out.println(str3);//oWo
		System.out.println("===========");
		
	}
}
