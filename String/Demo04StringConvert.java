/*
 * String当中与转换相关的常用方法有：
 * 
 * public char[] toCharArray():将当前字符串差分为字符数组作为返回值
 * public byte[] getBytes():获得当前字符串底层的字节数组
 * public String replace(CharSequence oldString,CharSequence newString)
 * 将所有出现的老字符串替换称为新的字符串，返回替换之后的结果新字符串
 */
public class Demo04StringConvert {
	
	public static void main(String[] args){
		//转换成为字符数组
		char[] chars = "Hello".toCharArray();
		System.out.println(chars[0]);//H
		System.out.println(chars.length);//5
		System.out.println("=========");
		
		//转换成为字节数组
		byte[] bytes = "abc".getBytes();
		for(int i = 0; i < bytes.length;i++){
			System.out.println(bytes[i]);
		}
		System.out.println("=========");
		
		String str1 = "How do you do?";
		String str2 = str1.replace("o","*");
		System.out.println(str1);//How do you do?
		System.out.println(str2);//H*w d* y*u D*?
		System.out.println("=========");
		
		String lang1 = "你会不会玩儿呀！你大爷的！";
		String lang2 = lang1.replace("你大爷的","****");
		System.out.println(lang2);
		
		
		
	}
}
