import java.util.Random;

/*
 * Random�����������������
 * int num = r.nextInt();��Χ��int���з�Χ������������
 * int num = r.nextInt(3);���������˷�Χ������ҿ����䣬0~2
 */
public class Demo01Random {
	public static void main(String[] args){
		Random r = new Random();
		
		int num = r.nextInt();
		System.out.println("������ǣ�" + num);
		
		Random x = new Random();
		int num1 = x.nextInt(3);
		System.out.println("������ǣ�" + num1);
	}
}
