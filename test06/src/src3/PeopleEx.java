package src3;

public class PeopleEx {

	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 200;		//people.selNum = 200 �� ���� == �����ʵ� == ����������
		p1.name	  = "������";		//�ν��Ͻ� ���� == ���� �ʵ�
	    p1.age	  = 31;
		p1.addr	  ="����";
		
		System.out.println(p1.selNum+"," +p1.name);
		
		
		People p2 = new People();
		p2.selNum =300;
		p2.name="�ڵ���";
		System.out.println(p1.selNum+"," +p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		p1.print1();
		p1.print2();
		
		
		
		//����(static) �޼ҵ� :��ü�� �������� �ش��ϴ� Ŭ�������� �ٷ� Ȱ���ϴ� �޼ҵ�
		people
	}
}
