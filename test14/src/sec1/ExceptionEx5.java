package sec1;
//ClassCastException : �� ��ȯ�� �߻��ϴ� ����
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class ExceptionEx5 {

	public static void main(String[] args) {
		Animal ani1 = new Dog();
		Animal ani2 = new Cat();
		changeAnimla(ani2);
	}
	public static void changeAnimla(Animal animal) {
		try {
			Dog dog = (Dog) animal;
		}catch(ClassCastException e) {
			System.out.println("������ �ٸ� ��Ű���� �ִ� Ŭ������ �� ��ȯ �Ұ�");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("�˼����¿���");
		}
	}
}
