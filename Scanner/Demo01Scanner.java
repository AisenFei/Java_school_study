import java.util.Scanner;
/*
 * Scanner��Ĺ��ܣ�����ʵ�ּ����������ݣ���������
 */
public class Demo01Scanner {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//3.��ȡ���������int����
		int num = sc.nextInt();
		System.out.println("�����int�����ǣ�" + num);
		
		//4.��ȡ����������ַ���
		String str = sc.next();
		System.out.println("������ַ����ǣ�" + str);
	}
}
