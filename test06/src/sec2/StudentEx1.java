package sec2;

public class StudentEx1 {

	public static void main(String[] args) {
		Student s1 = new Student("�����",1,100000);
		Student s2 = new Student("�̿���",2,200000);
		Student s3 = new Student("������",3,300000);
		
		Bus bus1 = new Bus(101);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		
		//�̿��� �л��� ����(101�� ����)�� �ι� �̿��ϰ�, ����ö�� 2ȣ���� ���� �̿��Ͽ��� ���
		//�̿��� �л��� ������ ���� 101ȣ ������ ����ö 2ȣ���� ������ ����Ͽ���		
		
		Subway su2 = new Subway(2);
		s2.takeBus(bus1);
		
		
		
	}

}
