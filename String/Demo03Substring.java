/*
 * �ַ����Ľ�ȡ������
 * public String substring(int index):��ȡ�Ӳ���Ϊֹһֱ���ַ���ĩβ���������ַ���
 * public String substring(int begin,int end)����ȡ��begin��ʼ��һֱ��end�������м���ַ���
 * ��ע��[begin,end),����ҿ�
 */
public class Demo03Substring {
	
	public static void main(String[] args){
		String str1 = "HelloWorld";
		String str2 = str1.substring(5);
		System.out.println(str1);//HelloWorld
		System.out.println(str2);//World,�µ��ַ���
		System.out.println("===========");
		
		String str3 = str1.substring(4,7);
		System.out.println(str3);//oWo
		System.out.println("===========");
		
	}
}
