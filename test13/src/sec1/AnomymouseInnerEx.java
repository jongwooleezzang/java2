package sec1;
class Outer3{//�ܺ� Ŭ����
	//�͸��� ���� Ŭ������ ����ÿ��� Runnable �� ����
	Runnable getRunnable(int i) {//Runnable �� �������̽� �̹Ƿ� �ν��Ͻ� ������ �⺻ �޼ҵ��� run() �޼ҵ��� ���������� ����ؾ߸� �Ѵ�.
		int num = 100;
		
		return new Runnable() {
			@Override	
			public void run() {
				System.out.println(i); //i => �Ű����� 
				System.out.println(num); // num =>��������
			}
		};
	}
	//�͸��� ���� �ν��Ͻ�(��ü) �� Runnable ����
	Runnable runner = new Runnable();
	
	
}

public class AnomymouseInnerEx {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		
	}

}
