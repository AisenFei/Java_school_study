import java.util.Arrays;

/*
 * ��Ŀ��
 * ��ʹ��Arrays��ص�API����һ������ַ����е������ַ��������У��������ӡ
 */
public class Demo02ArrayPractise {
	
	public static void main(String[] args){
		String str = "jk13b4jk12vjh41v2jh";
		
		char[] chars = str.toCharArray();
		Arrays.sort(chars);//���ַ����������������
		
		//��Ҫ�������
		for(int i = chars.length - 1; i >= 0; i--){
			System.out.println(chars[i]);
		}
	}
}
