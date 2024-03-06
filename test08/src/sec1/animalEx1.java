package sec1;

public class animalEx1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
	//선언자가 부모클래스에 있는경우 자식을 생성자 함수로 사용가능 
	//선언자가 자식클래스에 있는경우 생성자 함수에 부모클래스 사용 불가능
		
		
	//	Mammal m1 = new Animal();   :불가능
		Mammal m2 = new Mammal();
    //	Mammal m3 - new Birds ();   :불가능 
		
		Animal a4;	//선언을 따로한다 
		a4 = new Animal();  //Animal 객체 생성
		a4.setName("호랑이");
		a4.setSpine(true);
		a4.print();
		a4 = new Mammal();	//Mammal 객체로 형 변환이 가능 
	//  a4.setLegs(4);        불가능 (애니멀 객체가 아니라 불가)
		a4.print();
		
		a4 = new Birds();	//Birds  객체로 형 변환이 가능	= 자식 생성자 함수로 모두 형변환 가능
	//	a4.setWing           //불가능
		a4.setName("갈매기");
		System.out.println(a4.print());
		//메소드 오버라이딩 : 부모 클래스로 부터 상속 받은 메소드를 다르게 구현
		//그러므로, 부모 클래스로 선언된 객체는 부모 자신 또는 자식 생성자를 활용하여 다양하게 형 변환이 가능하다 =>다형성
		//클래스 => 캡슐화 , 정보 은닉 , 재사용성, 다형성 , 추상화 
		}

}
