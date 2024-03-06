package sec1;
//ClassCastException : 형 변환시 발생하는 예외
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
			System.out.println("형제나 다른 패키지에 있는 클래스는 형 변환 불가");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("알수없는예외");
		}
	}
}
