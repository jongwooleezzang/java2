package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<Student>sList = new LinkedList<>();
		//���1
		Student s1 = new Student();
		s1.setNo(1);
		s1.setName("���ο�");
		s1.setPoint(90);
		sList.add(s1);
		//���2
		Student s2 = new Student(2,"������",100);
	    sList.add(s2);
	    
	    //���3 
	    sList.add(new Student(3,"�輺��",90));
	     
	    System.out.println("��ȣ\t�̸�\t����");
	    for(Student s:sList) {
	    	System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getPoint());
	    }
	    System.out.println("=======�߰���=======");
	    sList.add(new Student());
		sList.set( 3, new Student(4, "�ǹ���",94));
		
		
		System.out.println("��ȣ\t�̸�\t����");
	    for(Student s:sList) {
	    	System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getPoint());	}
	}
}
