package sec1; //����Ŭ����
//�߻� Ŭ������ ���� ���� ���� �޼ҵ�� ���� Ŭ�������� �ݵ�� �� ���������� ����ؾ��Ѵ�
public class Arithmatic extends Repetor {
	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int su = 0;
		if(num1>num2) su = num1 / num2;
		else su = num2 / num1;
		return su;
	}

	@Override
	int power(int num1, int num2) {//2, 3
		int tmp = num1;
		for(int i=1;i<num2;i++) {//1 2 
			num1 = num1 * tmp;
		}
		return num1;
	}//num1 �� �ŵ�����
	
	public void print() {
		System.out.println("����, �߰��, ����⸦ �����մϴ�.");
	}
}
