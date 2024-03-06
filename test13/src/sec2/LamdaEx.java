package sec2;
//����(Lambda) ��(Expression) : �Լ� �� �޼ҵ带 �� ����ȭ�� ǥ����
//�ڹ��� �⺻���� ���ٽ� ���� ��� => �Լ��� �������̽�(Funtional Interface)
//�Լ��� �������̽��� @FunctionalInterface �� �����ϰ�, �޼ҵ�� ������ �ϳ��� �����Ѵ�. 
//@�� �ڹٿ��� ������̼�(Annotation)�� �ǹ� (�߿�)
//������̼�(Annotation) : �����ڰ� �����Ϸ����� Ư���� ������ �˷��ִ� ������ ���� ������� ������ ,�����Ϸ��� ��ü�� �˼����� ������ �߻���Ų��.
@FunctionalInterface
interface Lambda1{//�Ű����� x , ��ȯ x
	void method1();
}
@FunctionalInterface
interface Lambda2{//�Ű����� o , ��ȯ x
	void method2(int x , int y);
}
@FunctionalInterface
interface Lambda3{//�Ű����� x , ��ȯ o
	int method3();
}
@FunctionalInterface
interface Lambda4{//�Ű����� o , ��ȯ o
	int method4(int x, int y);
}	
	
	
	
public class LamdaEx {
	public static void main(String[] args) {
	/*	Lambda1 f1 = new Lambda1() {

			@Override
			public void method1() {
				
			}
			
		};
	 */
		System.out.println("���ٽ� 1 - �Ű�����x ,��ȭx");
		Lambda1 f1 = () ->{
			int x=100 , y=200;
			System.out.println(x+y);
		};
		f1.method1();
		
		
	}
}
