package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Set : ���� ����,�ߺ��� ������� �ʴ´�.(Map�� ���) �������� ���� ���� 
//Set�� ����: HashSet, TreeSet
public class SetEx {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set1.add("�����");
		set1.add("������");
		set1.add("�̿���");
		set1.add("������");
		set1.add("�����");
		set1.add("�̼���");
		set1.add("�̹α�");
		set1.add("�̿���");
		set1.add("�̿���");
		
		System.out.println("����� �� :"+set1.size()); //9���� �߰������� �ߺ��� �߻��Ͽ� 8�� �ߺ���� x
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� :");
		String name =sc.next();
		
		if(set1.contains(name)) {
			System.out.println("�ش��̸��� �����մϴ�.");
		}else {
			set1.add(name);
			System.out.println("�����ϴ�.");
		}
		
		set1.remove("�����"); //set1�� Ư����� ����
        set1.clear();    //set1 ����		
		
		
		if(set2.isEmpty()) {
			System.out.println("set2 �� ����ֽ��ϴ�");
		}else {
			System.out.println("set2 ����� ��: "+set2.size());
			
		}
		
		Set<Integer> set3 = new TreeSet<>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
		
		//Set �� ��ȸ (����  for ��)
		for(Integer s:set3) {
			System.out.print
			(s);
		}
		//Set �� ��ȸ Iterator�� ���� ��ȸ
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.print
			(it.next()+"\t");
			
		}
		
   }
}


