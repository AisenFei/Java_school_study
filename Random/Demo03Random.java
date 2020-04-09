import java.util.Random;

//1~22,随机取五个数字且不重复

public class Demo03Random {
	public static void main(String[] args){
		int n = 22;
		Random r = new Random();
		int[] arr = new int[5];
		arr[0] = r.nextInt(n) + 1;
		for(int i = 1; i < 5; i++){
			for(int j = 0; j < i ; j++){
				arr[i] = r.nextInt(n) + 1;
				if(arr[i] == arr[j]){
					i--;
					break;
				}
			}
		}
		for(int a : arr){
			System.out.println(a);
		}
		
	}
}
