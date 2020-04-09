import java.util.Random;

/*
 * Random类用来生成随机数字
 * int num = r.nextInt();范围是int所有范围，由正负两种
 * int num = r.nextInt(3);参数代表了范围，左闭右开区间，0~2
 */
public class Demo01Random {
	public static void main(String[] args){
		Random r = new Random();
		
		int num = r.nextInt();
		System.out.println("随机数是：" + num);
		
		Random x = new Random();
		int num1 = x.nextInt(3);
		System.out.println("随机数是：" + num1);
	}
}
