package sec3;

import java.util.Hashtable;
import java.util.Set;

public class HashtableEx {

	public static void main(String[] args) {
		//Hashtable ��ü����
		Hashtable<String ,Integer> hash = new Hashtable<>();
		hash.put("����", 1);
		hash.put("�λ�", 2);
		hash.put("��õ", 3);
		hash.put("�뱸", 4);
		hash.put("����", 5);
		hash.put("����", 6);
		hash.put("���", 7);
		//Q.hash table�� ����� ���� ����϶�
		
		System.out.println(hash.size());
		
		//hash table�� Ű�� "����" �� ��Ұ� �����ϴ��� ��
		if(hash.containsKey("����")) {
			System.out.println("���� Ű�� ������ ��Ұ� �����մϴ�.");
		}else {
			System.out.println("���� Ű�� ������ ��Ұ� �����ϴ�.");
		}
		//hash table�� Ű�� Set���� ������ �� ���
		Set<String> keySet = hash.keySet();
		
		//hash table ���� Ű�� "�뱸" �� ��� ����
		hash.remove("�뱸");
		
		//hash table�� ��ȸ�Ͽ� ��� ��Ʈ���� Ű�� ���� ���
		
		
		//
		
	}
	
}