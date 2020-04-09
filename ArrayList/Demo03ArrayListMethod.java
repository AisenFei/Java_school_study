import java.util.ArrayList;

/*
 * ArrayList���еĳ��÷����У�
 * 
 * public boolean add(E e):�򼯺ϵ������Ԫ�أ����������ͺͷ���һ��,����ֵ��������Ƿ�ɹ�
 * public E get(int index):�Ӽ��ϵ��л�ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ�ء�
 * public E remove(int index):�Ӽ��ϵ���ɾ��Ԫ�أ�����ʱ������ţ�����ֵ���Ǳ�ɾ������Ԫ��
 * public int size():�ӻ�ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ���
 */
public class Demo03ArrayListMethod {
	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list);//[]
		
		//�򼯺������Ԫ�أ�add
		boolean success = list.add("�߷�");
		System.out.println(list);//[�߷�]
		System.out.println("��ӵĶ����Ƿ�ɹ���" + success);// ture
		
		list.add("������");
		list.add("��Ҿ�");
		list.add("����");
		list.add("����");
		list.add("��");
		System.out.println(list);
		
		//�Ӽ����л�ȡԪ�أ�get,����ֵ��0��ʼ
		String name = list.get(2);
		System.out.println("��2������λ��" + name);
		
		//�Ӽ��ϵ���ɾ��Ԫ�أ�remove,����ֵ��0��ʼ
		String whoRemoved = list.remove(3);
		System.out.println("��ɾ�������ǣ�" + whoRemoved);
		System.out.println(list);
		
		//��ȡ���ϵĳ��ȳߴ磬Ҳ��������Ԫ�صĸ���
		int size = list.size();
		System.out.println("���ϵĳ����ǣ�" + size);
		
	}

}
