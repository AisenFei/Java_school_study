/*
 * String �������ȡ��صĳ��÷����У�
 * 
 * public int length():��ȡ�ַ������к��е��ַ��������õ��ַ�������
 * public String cancat(String str):����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ���
 * public char charAt(int index):��ȡָ������λ�õĵ����ַ���
 * public int indexOf(String str):���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ
 */
public class Demo02StringGet {
	
	public static void main(String[] args){
		//��ȡ�ַ����ĳ���
		int length = "asjdlkasjdl".length();
		System.out.println("�ַ����ĳ����ǣ�" + length);
		
		//ƴ���ַ���
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1.concat(str2);
		System.out.println(str1);//Hello
		System.out.println(str2);//World
		System.out.println(str3);//HelloWorld,�µ��ַ���
		System.out.println("=========");
		
		//��ȡָ������λ�õĵ����ַ�
		char ch = "Hello".charAt(1);
		System.out.println("��1������λ�õ��ַ����ǣ�" + ch);
		System.out.println("=========");
		
		//���Ҳ����ַ����ڱ����ַ������г��ֵĵ�һ������λ��
		//�������û�У�����-1ֵ
		String original = "HelloWorld";
		int index = original.indexOf("llo");
		System.out.println("��һ������ֵ�ǣ�" + index);//2
		
		System.out.println("HelloWorld".indexOf("abc"));//-1
		
	}
}
