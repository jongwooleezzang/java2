package src3;

public class Singleton {
	private static Singleton instance; //���� ��ü ����
	private Singleton( ) {} //�ܺο��� ������ �� ������ private
	public static synchronized Singleton getIIsntance( ) {//getInstance() ȣ��� ����
		if(instance ==null) instance = new Singleton();
		return instance;
	}
	
}
