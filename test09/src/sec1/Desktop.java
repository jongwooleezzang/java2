package sec1;

public class Desktop implements Computer {

	@Override
	public void display() {
		System.out.println("����ũž�� ����� �⺻ �ػ� : 1920 x 1080");
		
	}

	@Override
	public void typing() {
		System.out.println("����ũž�� ������ ���õ� Ű���带 Ÿ���� �մϴ�.");
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("����ũž�� ������ �մϴ�.");
		else System.out.println("����ũž�� ������ ���ϴ�.");
	}
	//�����ε�
	public void power(String name, boolean sw) {
	}
}
