package sec3;
//Animal(�θ� Ŭ���� = super), Mammal(�ڽ� Ŭ���� =sub)
public class Mammal extends Animal{//Animal �κ��� ��� �ɹ��� ��ӹ��� Mammal Ŭ����
	private String leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String print() {
		return Mammal "[ "leg=" +leg]";
	}
	
}
