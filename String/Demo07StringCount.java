import java.util.Scanner;

/*
 * ��Ŀ��
 * ��������һ���ַ���������ͳ�����и����ַ����ֵĴ�����
 * �����У���д��ĸ��Сд��ĸ�����֡�����
 */
public class Demo07StringCount {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String input = sc.next();
		
		int countUpper = 0;//��д��ĸ
		int countLower = 0;//Сд��ĸ
		int countNumber = 0; //����
		int countOther = 0;//�����ַ�
		
		char[] charArray = input.toCharArray();
		for(int i = 0; i < charArray.length; i++){
			char ch = charArray[i];//��ǰ�����ַ�
			if('A' <= ch && ch <= 'Z'){
				countUpper++;
			}else if('a' <= ch && ch <= 'z'){
				countLower++;
			}else if('0' <= ch && ch <= '9'){
				countNumber++;
			}else{
				countOther++;
			}
		}
		System.out.println("��д��ĸ�У�" + countUpper);
		System.out.println("Сд��ĸ�У�" + countLower);
		System.out.println("�����У�" + countNumber);
		System.out.println("�����ַ��У�" + countOther);
	}
}
