import java.util.Scanner;


public class Demo02Anonymous {

	public static void main(String[] args) {
		//��ͨʹ�÷�ʽ
		//Scanner sc = new Scanner(System.in);
		//int num1 = sc.nextInt();
		
		//��������ķ�ʽ
		//int num2 = new Scanner(System.in).nextInt();
		//System.out.println("������ǣ�" + num2);
		
		//ʹ���������������д���
		//methodParam(new Scanner(System.in));
		
		Scanner sc = methodReturn();
		int num = sc.nextInt();
		System.out.println("������ǣ�" + num);
	}
	
	public static void methodParam(Scanner sc){
		int num = sc.nextInt();
		System.out.println("������ǣ�" + num);
		
	}
	
	public static Scanner methodReturn(){
		return new Scanner(System.in);
	}

}
