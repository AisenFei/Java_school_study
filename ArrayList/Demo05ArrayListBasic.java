import java.util.ArrayList;

/*
 * ���ϣ���򼯺�ArrayList���д洢�����������ݣ�����ʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ
 * ��������		��װ�ࣨ�������ͣ���װ�඼λ��java.lang���£�
 * byte			Byte
 * short		Short
 * int			Integer		[����]
 * long			Long
 * float		Float
 * double		Double
 * char			Character	[����]
 * boolean		Boolean
 * 
 * ��JDK 1.5+��ʼ��֧���Զ�װ�䡢�Զ�����
 * 
 * �Զ�װ�䣺��������-->��װ����
 * �Զ����䣬��װ����-->��������
 */
public class Demo05ArrayListBasic {
	
	public static void main(String[] args){
		ArrayList<String> listA = new ArrayList<String>();
		//����д��������ֻ�����������ͣ������ǻ�������
		//ArrayList<int> listB = new ArrayList<int>();
		
		ArrayList<Integer> listC = new ArrayList<Integer>();
		listC.add(100);
		listC.add(200);
		System.out.println(listC);//[100,200];
		
		int num = listC.get(1);
		System.out.println("��1��Ԫ���ǣ�" + num);
	}

}
