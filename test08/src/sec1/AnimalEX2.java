package sec1;
import sec2.Animal;
import sec2.Mammal;
import sec2.Birds; //�ٸ���Ű���� Ŭ������ �ҷ��´�.
public class AnimalEX2 {
	public static void main(String[] args) {
		Animal a1; //Animal ��ä���� ���� ����Ʈ �����Ƿ� sec2�� �ִϸ� Ŭ������ �����´�
		a1 = new Animal();
		a1.setName("�䳢");
		a1.setSpine(true);
		System.out.println(a1.print());
		
		a1 = new Mammal();
		a1.setName("����");
		//a1.leg = 4;	
		System.out.println(a1.print());
		
		a1 = new Birds();
		a1.setName("�û���");
		System.out.println(a1.print());
	}
}

