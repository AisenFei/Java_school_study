/*
 * �ָ��ַ����ķ�����
 * public String[] split(String regex):���ղ����Ĺ��򣬽��ַ����зֳ�Ϊ���ɲ���
 * 
 * ע�����
 * split�����Ĳ�����ʵ��һ����������ʽ��
 * ����Ҫע�⣺�������Ӣ�ľ��"."�����з֣�����д"\\."
 */
public class Demo05StringSplit {
	public static void main(String[] args){
		String str1 = "aaa,bbb,ccc";
		String[] array1 = str1.split(",");
		for(int i = 0; i < array1.length; i++){
			System.out.println(array1[i]);
		}
		System.out.println("============");
		
		String str2 = "aaa bbb ccc";
		String[] array2 = str2.split(" ");
		for(int i = 0; i < array2.length; i++){
			System.out.println(array2[i]);
		}
		System.out.println("=============");
		
		String str3 = "xxx.yyy.zzz";
		String[] array3 = str3.split("\\.");
		System.out.println(array3.length);
		for(int i = 0; i < array3.length; i++){
			System.out.println(array3[i]);
		}
	}
}
