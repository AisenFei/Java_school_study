/*
 * java.util.Math������ѧ��صĹ����࣬�����ṩ�˴������ľ�̬�������������ѧ������صĲ���
 * 
 * public static double abs(double num):��ȡ����ֵ
 * public static double ceil(double num):����ȡ��
 * public static double floor(double num):����ȡ��
 * public static long round(double num):��������
 * Math.PI������Ƶ�Բ���ʳ���
 */
public class Demo01Math {
	
	public static void main(String[] args){
		//��ȡ����ֵ
		System.out.println(Math.abs(3.14));//3.14
		System.out.println(Math.abs(0));//0
		System.out.println(Math.abs(-1.2));//1.2
		System.out.println("=========");
		
		//����ȡ��
		System.out.println(Math.ceil(3.14));//4.0
		System.out.println(Math.ceil(3.9));//4.0
		System.out.println(Math.ceil(3.0));//3.0
		System.out.println("=========");
		
		//����ȡ��.Ĩ��
		System.out.println(Math.floor(3.14));//3.0
		System.out.println(Math.floor(30.1));//30.0
		System.out.println(Math.floor(31.21));//31.0
		System.out.println(Math.floor(31.9));//31.0
		System.out.println("=========");
		
		System.out.println(Math.round(20.4));//20
		System.out.println(Math.round(11.6));//12
	}
}
