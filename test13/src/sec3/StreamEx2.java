package sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//String Ÿ���� List Stream ���Ȱ��
//Steam.�޼ҵ�();
public class StreamEx2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("�̿���");
		lst.add("������");
		lst.add("������");
		lst.add("���ο�");
		lst.add("���ι�");
		lst.add("�ڹ���");
		
		//ArrayList�� Stream ȭ 
		Stream<String> stream = lst.stream(); 
		stream.forEach(s->System.out.println(s));
		System.out.println("==������==");
		lst.stream().sorted().forEach(s->System.out.println(s));
		
		//��Ҽ� ����Ͽ� ���
		 int cnt = (int) lst.stream().count();
		 System.out.println("�ο���(����Ǽ�) : "+cnt);
		
	
	}
}
