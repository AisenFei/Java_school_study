import java.util.ArrayList;

/*
 * ����ĳ��Ȳ����Է����ı�
 * ����ArrayList���ϵĳ����ǿ�������仯��
 * 
 * ����ArrayList��˵����һ��������<E>������
 * ���ͣ�Ҳ����װ�ڼ��ϵ��е�����Ԫ�أ�ȫ����ͳһ��ʲô����
 * ע�⣺����ֻ�����������ͣ������ǻ�������
 * 
 * ע�����
 * ����ArrayList������˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ���������ݡ�
 * ��������ǿգ��õ����ǿյ������ţ�[]
 */
public class Demo02ArrayList {
	public static void main(String[] args){
		//������һ��ArrayList���ϣ����ϵ�������List������װ��ȫ��String�ַ������͵�����
		//��ע����JDK 1.7+��ʼ���Ҳ�ļ������ڲ����Բ�д���ݣ�����<>������Ҫд�ġ�
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list);//[]
		
		//�򼯺ϵ������һЩ���ݣ���Ҫ�õ�add����
		list.add("�߷�");
		System.out.println(list);
		
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
		System.out.println(list);
	}
}
