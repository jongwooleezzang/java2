package sec4;

public class Shop implements Delivery {

	@Override
	public void sell() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void buy() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void delivery() {
		System.out.println("����ϱ�");
	}
	
}
