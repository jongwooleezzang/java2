package sec2;

import java.util.ArrayList;
import java.util.List;

//�÷��� ������ ��ũ : �⺻������ �ڹٿ��� �����ϴ� ���������͸� �����ϰ�,�����ϱ� ���� �̸�¥���� �ڷᱸ�� Ʋ
//Map,Set, List  �����ִ�.
public class CollectionEx1 {
	public static void main(String[] args) {
		//List �������̽� : ArrayList , Vector , LinkedList
		//Set  �������̽�: HashSet , TreeSet
		//Map  �������̽�: HashMap , Hashtable ,TreeMap , Properties
		//Stack , Queue, Deque �� �� �ڷᱸ���� �ش��ϴ� �÷��� �����ӿ�ũ�� �����̴�
		// �ڷᱸ���� �÷��� �����ӿ�ũ���� ���� ����ϴ� �޼ҵ�
		//add : �ش� �÷��� �����ӿ�ũ�� �ν��Ͻ� �߰� 
		//clear: �ش� �÷��� �����ӿ�ũ�� ��� �ν��Ͻ� ����
		//remove:�ش� �÷��� �����ӿ�ũ�� Ư�� �ν��Ͻ� ����
		//size : �ش� �÷��� �����ӿ�ũ�� �ν��Ͻ� ����
		//iterator : �и���(�ݺ���)�� �ǹ�
		
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		lst.add("e");
		for(String s : lst) {
			System.out.println(s);
		}
		//List<Student>,Map<Board>,Set<Data> => <>�� ���ڰ� �����ǹǷ� ���ʸ��� �����̴�
		
	}

}
