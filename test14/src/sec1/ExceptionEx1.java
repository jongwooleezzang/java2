package sec1;
//���� (Exception) ó��: ���α׷��ֿ��� ������ ������ �߻��ϸ�,�� ���Ŀ� ó�������� ó���������ϰ�, ������ �����ǹǷ� 
//�̷��� ��츦 ����(Exception) ��� �ϸ�, �׷��ٸ�, ���� ������� ���� �ɼ� �ֵ���
//���ܻ����� ��� ���� ���嵵 ó���� �� �� �ֵ��� �ϴ� ���� ���� ó�� ����մϴ�.
public class ExceptionEx1 {
	public static void main(String[] args) {
		String name =null;
		//���� ó���� ����(try)�� ���ܰ� �߻��ϸ�, ����ó�� ������ �����Ѵ�
		
		try {
			//������ ó���ҹ���
			System.out.println(name.toString());//ó���ҹ�
		} catch(Exception e) {
			//���ܰ� �߻��� ��� ó���� ���� 
			System.out.println("�� �� ���� ���ܰ� �߻��Ͽ����ϴ�.");
		}
	}
}
