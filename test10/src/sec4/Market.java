package sec4;
//implements �� �ν��Ͻ��� ���߻�� ������ �ִ�.
public class Market implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

}
