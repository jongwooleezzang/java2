package sec1; //�߻�Ŭ���� :�Ϻ� �Ǵ� ���� �߻�ȭ �޼ҵ尡 ����ȴ�.
//�������̽��� ���� ��� ���� �߻� Ŭ������ ���� �Ǵ� �Ϻθ� �߻�ȭ �Ҽ� ������,
//���� ���� �޼ҵ忡 ���Ͽ� ���ϴ� �޼ҵ常 �����̰���
//������ �߻� �޼ҵ嵵 ������ �� ����
public abstract class Repetor implements Calcurator {

	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		int su = 0;
		if(num1 > num2) su = num1 - num2;
		else su = num2 - num1;
		return su;
	}

	abstract int power(int num1, int num2);

}






