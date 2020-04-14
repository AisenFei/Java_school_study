import java.util.Scanner;

/*
 * 题目：
 * 键盘输入一个字符串，并且统计其中各种字符出现的次数。
 * 种类有：大写字母、小写字母、数字、其他
 */
public class Demo07StringCount {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String input = sc.next();
		
		int countUpper = 0;//大写字母
		int countLower = 0;//小写字母
		int countNumber = 0; //数字
		int countOther = 0;//其他字符
		
		char[] charArray = input.toCharArray();
		for(int i = 0; i < charArray.length; i++){
			char ch = charArray[i];//当前单个字符
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
		System.out.println("大写字母有：" + countUpper);
		System.out.println("小写字母有：" + countLower);
		System.out.println("数字有：" + countNumber);
		System.out.println("其他字符有：" + countOther);
	}
}
