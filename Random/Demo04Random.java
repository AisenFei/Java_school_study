import java.util.Random;
import java.util.Scanner;

//�ô���ģ������ֵ�С��Ϸ
public class Demo04Random {
	
	public static void main(String[] args){
		Random r = new Random();
		int randomNum = r.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("��������²�����֣�");
			int guessNum = sc.nextInt();
			
			if(guessNum > randomNum) {
				System.out.println("̫���ˣ������ԡ�");
			}else if(guessNum < randomNum){
				System.out.println("̫С�ˣ������ԡ�");
			}else{
				System.out.println("��ϲ�㣬��������");
				break;
			}
		}
		System.out.println("��Ϸ������");
	}
}
