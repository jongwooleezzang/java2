package sec5;
//�ΰ��� �������̽� ��� =>�� ���� �������̽��� ����� �޼ҵ带 �ϳ��� Ŭ������ ��ġ��
//public class �ڽ�Ŭ���� implements �������̽�1 ,�������̽�2{}
//�ΰ��� Ŭ���� ����� ������� �����Ƿ� �ϳ��� �θ�Ŭ������ �ڽ�Ŭ���� ���·� �����, �ļ�Ŭ�������� �޼ҵ峪 �޼ҵ峪 �ʵ带 ��ģ��
//public class �ڽ�Ŭ���� extends �θ�Ŭ����{}
//public class �ļ�Ŭ���� extends �ڽ�Ŭ����{}
//�ϳ��� Ŭ������ �ϳ��� �������̽� ��� =>Ŭ������ �ʵ� ,������  �������̽��� �޼ҵ带 �ϳ��� Ŭ������ ��ġ����
//public class �ڽ�Ŭ���� extends �θ�Ŭ���� {} implements �������̽�{}
public class BookShelf extends Shelf implements Queue{// ���������� Ŭ������ extends �������̽������� ť�� implemensts

	@Override
	public void enQueue(String title) {
		shelf.add(title);   //�̰� �ֿ�����?
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
