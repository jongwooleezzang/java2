package sec1;
class Outer3{//외부 클래스
	//익명의 내부 클래스를 선언시에는 Runnable 로 구형
	Runnable getRunnable(int i) {//Runnable 은 인터페이스 이므로 인스턴스 생성시 기본 메소드인 run() 메소드의 구현내용을 기술해야만 한다.
		int num = 100;
		
		return new Runnable() {
			@Override	
			public void run() {
				System.out.println(i); //i => 매개변수 
				System.out.println(num); // num =>지역변수
			}
		};
	}
	//익명의 실행 인스턴스(객체) 를 Runnable 생성
	Runnable runner = new Runnable();
	
	
}

public class AnomymouseInnerEx {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		
	}

}
