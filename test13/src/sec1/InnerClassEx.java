package sec1;
//���� Ŭ����(Inner Class) : Ŭ���� �ȿ� �� ���� Ŭ���� 
class Outer{ //�ܺ� Ŭ����
	private int num =10;  //�ɹ��ʵ� 
	private static int sNum =10; //���� �ɹ��ʵ� =>�����Ͱ��� 
	
	public Inner inner;
	
	public Outer() { //Outer �����ڸ� ����ϰ� �Ǹ�, �ڵ������� ���� Ŭ������ ���� �ν��Ͻ��� ����
		inner = new Inner();
	}
	class Inner { //����Ŭ���� (Ŭ���� �ȿ� Ŭ����) //�ν��Ͻ� ����Ŭ����
		int inNum =1000;
		
		void inMethod() {
			System.out.println("����Ŭ���� ���� �ܺ�Ŭ������ �ɹ� : "+ num);
			System.out.println("����Ŭ���� ���� �ܺ�Ŭ������ ���� �ɹ� ���� ����  : "+ sNum);
		}
	}
    public void outMethod() {//�ܺ� Ŭ�������� ���� Ŭ������ �޼ҵ��� ȣ��
       inner.inMethod();
    }
}




public class InnerClassEx {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outMethod();
		out.inner.inMethod();// Ÿ Ŭ�������� 
	}

}
