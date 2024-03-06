package sec1;
import sec2.Animal;
import sec2.Mammal;
import sec2.Birds; //다른패키지의 클래스를 불러온다.
public class AnimalEX2 {
	public static void main(String[] args) {
		Animal a1; //Animal 객채선언 위에 임폴트 했으므로 sec2의 애니멀 클래스를 가져온다
		a1 = new Animal();
		a1.setName("토끼");
		a1.setSpine(true);
		System.out.println(a1.print());
		
		a1 = new Mammal();
		a1.setName("사자");
		//a1.leg = 4;	
		System.out.println(a1.print());
		
		a1 = new Birds();
		a1.setName("올빼미");
		System.out.println(a1.print());
	}
}

