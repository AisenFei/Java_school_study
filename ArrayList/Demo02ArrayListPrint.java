import java.util.ArrayList;

//������ָ����ʽ��ӡ���ϵķ���(ArrayList������Ϊ����),ʹ��{}��������ʹ��@�ָ�ÿ��Ԫ��
//��ʽ����{Ԫ��@Ԫ��@Ԫ��@Ԫ��}
public class Demo02ArrayListPrint {
	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("�߷�");
		list.add("������");
		list.add("��Ҿ�");
		list.add("����");
		
		print1(list);
	}
	
	public static void print1(ArrayList<String> list){
		System.out.print("{");
		for(int i = 0; i < list.size(); i++){
			if(i == list.size()-1){
				System.out.print(list.get(i) + "}");
			}
			else{
				System.out.print(list.get(i) + "@");
			}
			
		}
	}
}
