package sec1;
//���� ���� Ŭ������ Inner Ŭ������ �ܺε� ���ε� ���� ��Ҹ� ���
class Outer2{
	private int num = 10; 
	private static int sNum =20;
	
	
	
	static class Inner{
		int inNum =1000;
		static int sInNum = 2000;
		
		void inMethod() {
			System.out.println("���� Ŭ������ �ν��Ͻ� ���� :" +inNum);
			System.out.println("���� Ŭ������ ���� �ɹ����� :" +sInNum);
		  //System.out.println("�ܺ� Ŭ������ �ν��Ͻ� �ɹ����� :" +num);
			System.out.println("�ܺ� Ŭ������ �ν��Ͻ� �ɹ����� :" +sNum);
		}
	}
	static void outMethod() {
		System.out.println("�ܺο��� ���� Ŭ������ �ν��Ͻ� ���� :" +inNum);//�Ұ�
		System.out.println("�ܺο��� ���� Ŭ������ ���� �ν��Ͻ� ���� :" +Inner.sInNum);
		System.out.println("�ܺο��� �ܺ� Ŭ������ �ν��Ͻ� ���� :" +num);//�Ұ�
		System.out.println("�ܺο���  �ܺ� Ŭ������ �ν��Ͻ� ���� :" +sNum);
	}
	
	
}

 
public class StaticInnerClassEx {

	public static void main(String[] args) {
		Outer2 out =new Outer2(); //�ܺ� Ŭ������ �ν��Ͻ� 
		//out.outMethod(); //out Method()�� ���� �޼ҵ��̹Ƿ� ��ü�� �������� �ʰ� ,����
		Outer2.outMethod();
	
		Outer2.outMethod();//outMethod() ���� �޼ҵ��̹Ƿ� ��ü�� �������� �ʰ� ,����
		Outer2.Inner inner = new Outer2.Inner(); //���� Ŭ������ �ν��Ͻ� 
		Outer2.Inner inner2 = new out.Inner(); //���� ���� Ŭ������ �ν��Ͻ�  
		
	}

}
