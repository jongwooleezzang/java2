package edu.kh.test1;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		Member m1 = new Member();
		
		m1.setName("ȫ�浿");
		m1.setAge(25);  //=> int �� �ֵ���ǥ �� ���ڰ� ��������
		m1.setAddress("����� ��������");
		m1.setHobby("����");
		
		Member m2 = new Member();
		
		m2.setName("��̿�");
		m2.setAge(20); //=> ���͵���
	    m2.setAddress("����� ��õ��");
	    m2.setHobby("�");
	    
	    List<Member> list = new ArrayList<Member>();
	    
	    list.add(m1);
	    list.add(m2);
	    
		for(Member mem : list) {//�̰� �׳ɿֿ��ߵǴ°ǰ� // for(int i = 0; i < list.size(); i++)// Member mem = list.get(i);
            System.out.println("�̸� :" + mem.getName());
			System.out.println("�̸� :"+mem.getName());  //=>.getName ���ͻ��
			System.out.println("���� :"+mem.getAge());
			System.out.println("�ּ� :"+mem.getAddress());
			System.out.println("��� :"+mem.getHobby());
		}
	
	}

}
