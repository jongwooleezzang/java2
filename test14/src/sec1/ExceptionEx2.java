package sec1;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		String name =null;
		//���� ó���� ����(try)�� ���ܰ� �߻��ϸ�, ����ó�� ������ �����Ѵ�
		//���� ĳġ ����
		try {
			System.out.println(name.toString());
			System.out.println("����ó�� ���� �Ʒ�");
		} catch(NullPointerException e) {
			e.printStackTrace();
			name = "�����";
			System.out.println(name+"\n����ó�� ����Ʒ�");
		} catch(Exception e) {
			System.out.println("��ü�� �˼� ���� ���� �߻�");
		}
	}

}



