//�����������ֻ���ұߵĶ���û����ߵ����ֺ͸�ֵ�����
public class Demo01Anonymous {
	public static void main(String[] args){
		//��������ı�׼��ʽ��
		Person one = new Person();
		one.name = "�߷�";
		one.showName();
		System.out.println("=============");
		
		//��������
		new Person().name = "������";
		new Person().showName();//�ҽ�:null
	}
}
