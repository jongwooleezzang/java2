package sec1;

public class Tablet	implements Computer {

	@Override
	public void display() {
		System.out.println("�º��� �⺻ �ػ� : 640 x 960");
	}

	@Override
	public void typing() {
		System.out.println("�º��� ����ǥ���� �ش� �ۼ踦 ��ġ�մϴ�.");
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("�º��� ������ �մϴ�.");
		else System.out.println("�º��� ������ ���ϴ�.");
	}
}
