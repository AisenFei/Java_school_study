/*
 * ==�ǶԽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ��Ҫ�ַ��������ݱȽϣ�����ʹ����������
 * public boolean equals(Object obj):�����������κζ���ֻ�в�����һ���ַ�������������ͬ�ĲŻ��true�����򷵻�false
 * ע�����
 * 1.�κζ�������Object���н���
 * 2.equals�������жԳ��ԣ�Ҳ����a.equals(b)��b.equals(b)Ч��һ��
 * 3.����Ƚ�˫��һ������һ���������Ƽ��ѳ����ַ���д��ǰ�档
 * 
 * public boolean equalsIgnoreCase(String str):���Դ�Сд���������ݱȽ�
 */
public class Demo01StringEquals {

	public static void main(String[] args){
		String str1 = "Hello";
		String str2 = "Hello";
		char[] charArray = {'H','e','l','l','e'};
		String str3 = new String(charArray);
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str2.equals(str3));//true
		System.out.println(str3.equals("Hello"));//true
		System.out.println("Hello".equals(str1));
		
		String str4 = "hello";
		System.out.println(str1.equals(str4));//false
		System.out.println("==========");
		
		String str5 = null;
		System.out.println("abc".equals(str5));//false
//		System.out.println(str5.equals("abc"));//��ָ���쳣
		System.out.println("==========");
		
		String strA = "Java";
		String strB = "java";
		System.out.println(strA.equals(strB));//false,�ϸ����ִ�Сд
		System.out.println(strA.equalsIgnoreCase(strB));//true,���Դ�Сд
		
		//ֻ��Ӣ����ĸ���ִ�Сд
		System.out.println("abcһ123".equalsIgnoreCase("abcҼ123"));
	}
}
