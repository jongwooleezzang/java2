package sec1;
//정적 내부 클래스인 Inner 클래스는 외부든 내부든 정적 요소만 허용
class Outer2{
	private int num = 10; 
	private static int sNum =20;
	
	
	
	static class Inner{
		int inNum =1000;
		static int sInNum = 2000;
		
		void inMethod() {
			System.out.println("내부 클래스의 인스턴스 변수 :" +inNum);
			System.out.println("내부 클래스의 정적 맴버변수 :" +sInNum);
		  //System.out.println("외부 클래스의 인스턴스 맴버변수 :" +num);
			System.out.println("외부 클래스의 인스턴스 맴버변수 :" +sNum);
		}
	}
	static void outMethod() {
		System.out.println("외부에서 내부 클래스의 인스턴스 변수 :" +inNum);//불가
		System.out.println("외부에서 내부 클래스의 정적 인스턴스 변수 :" +Inner.sInNum);
		System.out.println("외부에서 외부 클래스의 인스턴스 변수 :" +num);//불가
		System.out.println("외부에서  외부 클래스의 인스턴스 변수 :" +sNum);
	}
	
	
}

 
public class StaticInnerClassEx {

	public static void main(String[] args) {
		Outer2 out =new Outer2(); //외부 클래스의 인스턴스 
		//out.outMethod(); //out Method()는 정적 메소드이므로 객체를 생성하지 않고 ,실행
		Outer2.outMethod();
	
		Outer2.outMethod();//outMethod() 정적 메소드이므로 객체를 생성하지 않고 ,실행
		Outer2.Inner inner = new Outer2.Inner(); //내부 클래스의 인스턴스 
		Outer2.Inner inner2 = new out.Inner(); //정적 내부 클래스의 인스턴스  
		
	}

}
