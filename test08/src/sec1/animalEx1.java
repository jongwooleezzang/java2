package sec1;

public class animalEx1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
	//�����ڰ� �θ�Ŭ������ �ִ°�� �ڽ��� ������ �Լ��� ��밡�� 
	//�����ڰ� �ڽ�Ŭ������ �ִ°�� ������ �Լ��� �θ�Ŭ���� ��� �Ұ���
		
		
	//	Mammal m1 = new Animal();   :�Ұ���
		Mammal m2 = new Mammal();
    //	Mammal m3 - new Birds ();   :�Ұ��� 
		
		Animal a4;	//������ �����Ѵ� 
		a4 = new Animal();  //Animal ��ü ����
		a4.setName("ȣ����");
		a4.setSpine(true);
		a4.print();
		a4 = new Mammal();	//Mammal ��ü�� �� ��ȯ�� ���� 
	//  a4.setLegs(4);        �Ұ��� (�ִϸ� ��ü�� �ƴ϶� �Ұ�)
		a4.print();
		
		a4 = new Birds();	//Birds  ��ü�� �� ��ȯ�� ����	= �ڽ� ������ �Լ��� ��� ����ȯ ����
	//	a4.setWing           //�Ұ���
		a4.setName("���ű�");
		System.out.println(a4.print());
		//�޼ҵ� �������̵� : �θ� Ŭ������ ���� ��� ���� �޼ҵ带 �ٸ��� ����
		//�׷��Ƿ�, �θ� Ŭ������ ����� ��ü�� �θ� �ڽ� �Ǵ� �ڽ� �����ڸ� Ȱ���Ͽ� �پ��ϰ� �� ��ȯ�� �����ϴ� =>������
		//Ŭ���� => ĸ��ȭ , ���� ���� , ���뼺, ������ , �߻�ȭ 
		}

}
