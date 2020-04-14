import java.util.Arrays;

/*
 * 题目：
 * 请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
 */
public class Demo02ArrayPractise {
	
	public static void main(String[] args){
		String str = "jk13b4jk12vjh41v2jh";
		
		char[] chars = str.toCharArray();
		Arrays.sort(chars);//对字符数组进行升序排列
		
		//需要倒叙遍历
		for(int i = chars.length - 1; i >= 0; i--){
			System.out.println(chars[i]);
		}
	}
}
