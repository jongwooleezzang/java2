package sec1;

import sec2.Student;

public class GenericEx {

	public static void main(String[] args) {
		//�����ڿ� ���� ���ʸ��� Ÿ�� ���� ���� -�ڹ� 1.7�̻� 1.8����
		Generic1<Student> s  = new Generic1<Student>();	
		Student a = new Student("�����" , 21);
		
	}
}