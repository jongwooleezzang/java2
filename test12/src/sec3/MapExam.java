package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
//Map :HashMap,Hashtable,TreeMap,Properties =>Ű�� ���� �и��ÿ��� entry Ȥ�� element������ Iterator�̳� Enumeration �� �ʿ���
public class MapExam {
	public static void main(String[] args) {
		Map<String, Integer>map1 = new HashMap<>();
		Map<String, String>map2 = new Hashtable<>();
		
		Map<Integer, String >map3 = new TreeMap<>();
		Properties map4 = new Properties();
		//list �� ������ �׻� key �� value �� ����
		//index(����) �� ���� => ���������� �����ʴ´�
		map1.put("kim", 90); //�߰�
		map1.put("Lee", 91); //�߰�
		map1.put("Park", 92); //�߰�
		map1.put("Kwon", 93); //�߰�
		System.out.println(map1);
		System.out.println("Park :" +map1.get("Park"));//������� ���ٽ� �ε������ƴ϶� Ű�� �����Ѵ�
		//�� ��ȸ1 : Iterator�� ���� ����
		//keys = {Kim,lee,park,kang,kwon}
		Iterator<String> keys = map1.keySet().iterator(); //���� Ű����(keyset)�� �ϳ��� ��ҷ� ��޵ȴ�
		while(keys.hasNext()){
			String key =keys.next();
			System.out.println(key+"="+map1.get(key));
		
		//�� ��ȸ2 :entryset(Ű�� ���� ��=>entry)�� ���� ����
		for(Map.Entry<String, Integer> en: map1.entrySet());
			String key1 = en.getkey
			Integer value = en.Properties
			System.out.println(key1+":"+value);
		//�� ��ȸ 3 :KeySet �� ���� ����
			System.out.println("keyset�� ���� ��ȸ");
			for(String k : map1.keySet()) {
				System.out.println(key1+":"+map1.get(key1));
			}
			
		
		if(map1.containsKey("Park")) {//Ư��Ű�� ���������� Ȯ����
			
			System.out.println("Park :" +map1.get("Park"));
		}else {
			System.out.println("Ű�� Park�� ��Ҵ� �������� �ʽ��ϴ�.");
		}
		
		if(map1.containsValue(100)) {//Ư�� ���� ���������� Ȯ��
			System.out.println("100�� �� �����մϴ�.");
		}else {
				System.out.println("100���� ���������ʽ��ϴ�");
		}
		
		map2.put("��", "1�ڽ�"); //Ű�� �ߺ��ɼ����� �ߺ��Ǹ� ������ �����γ���
		map2.put("��", "2�ڽ�");
		map2.put("��", "3�ڽ�");
		map2.put("��", "2�ڽ�");
		map2.put("��", "3�ڽ�");
		map2.put("��", "1�ڽ�");
		System.out.println(map2);
		map2.remove("��");
		System.out.println("=====������====");
		System.out.println(map2);
		map2.clear();
		System.out.println("=====������====");
		System.out.println(map2);
		//�迭�� ���� TreeMap�� ����
		String[] names = {"a" ,"b", "c", "d", "e", "f", "g", "h", "i", "j" };
		for(int i=0 ; i<=9; i++) {
			map3.put(i, names[i]);
			
		}
		System.out.println("�ο��� : "+map3.size());
		for(Integer i :map3.keySet()) {
			int k = i;
			String value1 = map3.get(i);
			
		}
		//Propertie�� Ű(�ʵ��̸�) �� ���� ��� ���ڿ��� ��޵ȴ�
		map4.setProperty("name", "�����");
		map4.setProperty("age", "43");
		map4.setProperty("height", "173.7");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "70");
		map4.setProperty("mat", "100");
		
		
		
		
  }
	
 }
}
 
