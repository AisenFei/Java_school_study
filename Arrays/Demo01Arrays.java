import java.util.Arrays;

/*
 * java.util.Arrays��һ����������صĹ����࣬�����ṩ�˴�����̬����������ʵ�����鳣���Ĳ�����
 * 
 * public static String toString(����):�������������ַ���������Ĭ�ϸ�ʽ��[Ԫ��1��Ԫ��2��Ԫ��3������])
 * public static void sort(����):����Ĭ�����򣨴�С���󣩶������Ԫ�ؽ�������
 * 
 * ��ע���������ֵ��sortĬ�ϰ�������
 * 		������ַ�����sortĬ�ϰ�����ĸ����
 * 		������Զ�������ͣ���ô����Զ��������Ҫ��Comparable����Comparator�ӿڵ�֧�֡�
 */
public class Demo01Arrays {
	
	public static void main(String[] args){
		int[] intArray = {10,20,30};
		//��int[]���鰴��Ĭ�ϸ�ʽ����ַ���
		String intStr = Arrays.toString(intArray);
		System.out.println(intStr);//[10,20,30]
		
		int[] array1 = {2,1,3,10,6};
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));//[1,2,3,6,10]
		
		String[] array2 = {"bbb","aaa","ccc"};
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
	}
	
	

}
