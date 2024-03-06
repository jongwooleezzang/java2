package sec1;
//내부 클래스(Inner Class) : 클래스 안에 더 작은 클래스 
class Outer{ //외부 클래스
	private int num =10;  //맴버필드 
	private static int sNum =10; //정적 맴버필드 =>데이터공유 
	
	public Inner inner;
	
	public Outer() { //Outer 생성자를 사용하게 되면, 자동적으로 내부 클래스에 대한 인스턴스가 생성
		inner = new Inner();
	}
	class Inner { //내부클래스 (클래스 안에 클래스) //인스턴스 내부클래스
		int inNum =1000;
		
		void inMethod() {
			System.out.println("내부클래스 에서 외부클래스의 맴버 : "+ num);
			System.out.println("내부클래스 에서 외부클래스의 정적 맴버 변수 접근  : "+ sNum);
		}
	}
    public void outMethod() {//외부 클래스에서 내부 클래스의 메소드의 호출
       inner.inMethod();
    }
}




public class InnerClassEx {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outMethod();
		out.inner.inMethod();// 타 클래스에서 
	}

}
