package sec1;

public class CalcEx2 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		
		Calcurator cal1;
		
		//���� ������ ����Ǿ� ���� �����Ƿ� �߻�ü�δ� ��ü�� ������ �� ����
		//cal1 = new Calcurator();
		//cal1 = new Repeator();
		
		cal1 = new Arithmatic();
		
		//cal1�� Calcurator�� ����Ǿ� �����Ƿ� Calcurator�� print() �޼ҵ尡 �����Ƿ� ���� �Ұ�
		//cal1.print();
		System.out.println("������ : "+cal1.PI);
		System.out.println("���� : "+cal1.add(num1, num2));
		System.out.println("���� : "+cal1.subtract(num1, num2));
		System.out.println("���� : "+cal1.multiply(num1, num2));
		System.out.println("������ : "+cal1.divide(num1, num2));
		//cal1�� Calcurator�� ����Ǿ� �����Ƿ� Calcurator�� power() �޼ҵ尡 �����Ƿ� ���� �Ұ�
		//System.out.println("�ŵ����� : "+cal1.power(num1, num2));
		
		//�׷��Ƿ� ���� �������̽��� ����Ǿ� �ڽ� Ŭ������ �����ڷ� ������ �ν��Ͻ�(��ü)��
		//���� �������̽��� ����� �޼ҵ常 ����� �� ������, ����Ǵ� ������ 
		//�ڽ� Ŭ�������� ����� ������ ����ȴ�.
		
		//�������̽� => Ŭ���� : implements(��üȭ == ����ȭ)
		//Ŭ���� => Ŭ���� : extends(Ȯ��)
		//�������̽� => �������̽� : extends(Ȯ��)
	}

}
