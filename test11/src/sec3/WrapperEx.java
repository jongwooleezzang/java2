package sec3;

public class WrapperEx {

	public static void main(String[] args) {
		//	int a; //�⺻Ÿ��
		//	System.out.println("a=" +a); //���� �ʱ�ȭ �����ʾƼ� ����
		int a = 10;   //�⺻Ÿ�� ����
		Integer b =a; //������ Ÿ�� ����(�������� �⺻�������� ���� : Wrapping,Boxing)
		int c = b; //  �⺻���� ������ ������ ���� UnWrap , UnBoxing
		/*Boxing :  �⺻���� ����� ������ �����Ƿ� �ش�Ÿ���� �޼ҵ峪 �ʵ尡 ���⋚����
					���������� �����Ͽ��� ���� �ʿ��� ������ Ȯ���ϰ�, �� Ÿ���� �޼ҵ带 ����� �� �־�� �ϹǷ�
					�ش� Ÿ���� ���� �޼ҵ带 ����ϱ� ���ؼ��� �⺻���� ���������� �ٲپ�� �Ѵ�.
					�׷��Ƿ�, �⺻Ÿ�Կ� ���õ� Boxing�� �ǽ��Ͽ� ���������� ������ �� �ִ� 
					Ŭ������ Wrapper Ŭ������� �Ѵ�
		*/
		//boolean <=> Boolean
		//byte    <=> Byte
		//char    <=> Character
		//short   <=> Short
		//int     <=> Integer
		//long    <=> Long
		//float   <=> Float 
		String d = "10";
		String e ="3.14";
		System.out.println("���ڿ� 10�� Integer(����) Ÿ���� 10���� ���� =>"+Integer.valueOf(10));
		System.out.println("���ڿ� 3.14�� Double(�Ǽ�) Ÿ���� 3.14�� ���� => "+Double.valueOf(e));
	}

}
