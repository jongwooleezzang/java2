package src3;
//Scope: Ư�� ������ ������ ��ġ�� ����
public class SocpeEx {
	int a = 10;  //�������� :Ŭ���� ��ü���� �����Ǵ� ��������,Ư�� �޼ҵ� �������� �������� ����
	static int b =100;	//Ŭ���� ����: Ŭ���� ��ü���� �����Ǹ� ,Ư�� �޼ҵ� �������� ������ =>Global Scope
	public static void main(String[] args) {
		int a = 20; //�������� : Ư�� �޼ҵ� ������ ����Ǿ� Ȱ��Ǵ� �����μ� �Լ� ����� ����� ,�����Ҽ� ���� =>Local Scope
		System.out.println("�������� a="+a);
		run();
		run(30);
	}
	public static void run()	{
		System.out.println("b="+b);
		System.out.println("Ŭ���� ����b="+b);
	}
	public static void run(int a)	{//�Ű�����:�޼ҵ� ���ǽ� ��ȣ �ȿ� �ִ� ������ ȣ��� �����Ȱ��� �����Ѵ�=>Local Scope
		System.out.println("�Ű����� a="+a);
	}
}
