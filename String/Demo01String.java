
public class Demo01String {
	
	public static void main(String[] args){
		//ʹ�ÿղι���
		String str1 = new String();
		System.out.println("��һ���ַ����ǣ�" + str1);
		
		//�����ַ����鴴���ַ���
		char[] charArray = {'A','B','C'};
		String str2 = new String(charArray);
		System.out.println("�ڶ����ַ����ǣ�" + str2);
		
		//�����ֽ����鴴���ַ���
		byte[] byteArray = {97,98,99};
		String str3 = new String(byteArray);
		System.out.println("�������ַ����ǣ�" + str3);
		
		//ֱ�Ӵ���
		String str4 = "Hello";
		System.out.println("���ĸ��ַ����ǣ�" + str4);
	}
}
