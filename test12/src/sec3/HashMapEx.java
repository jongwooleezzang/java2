package sec3;

import java.util.HashMap;
import java.util.Map;

//�ڷᱸ�� (�ڷ��� ������ ���� ������ ���� ����)
//1. �ܼ�����(Primitive) :����,�Ǽ�,����,���ڿ�,����
//2. ��������(Sequence)  :�迭(Array), ����Ʈ(List), ����(Stack), ť(Queue) //������
//3. ���� ����(Non-Sequence): ��(Map), Ʈ��(Tree), �׷���(Graph), ��(Set)
public class HashMapEx {

	public static void main(String[] args) {
		//������
		Map<String ,String> map0 = new HashMap<String,String>();
		HashMap<String ,String> map1 = new HashMap<String,String>();
		HashMap<String ,String> map2 = new HashMap<String,String>();
		HashMap<String ,String> map3 = new HashMap<>();
		
		HashMap<String ,String> map4 = new HashMap<>(10);
		HashMap<String ,String> map5 = new HashMap<>(10, 0.7f);//loaS
		HashMap<String ,String> map6 = new HashMap<>(){{
			put("name","�����");
		}};
		
	}

}
