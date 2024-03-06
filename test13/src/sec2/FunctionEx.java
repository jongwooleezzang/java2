package sec2;
//함수(메소드) 정의와 사용방법
//메소드 기술
class Met1{
	void method1() {
		int x = 100 , y = 200;
		System.out.println(x+y);
	}
}
class Met2 {
	void method2(int x, int y) {
		System.out.println(x+y);
	}
}
class Met3 {
	 int method3() {
		 int x= 100, y= 200;
		 return x+y;	
	}
}
class Met4 {
	 int method4(int x, int y) {
		 return x+y;	
	}
}





public class FunctionEx {
	//메서드(Method) : 특정 클래스에 맴버로 규정되어 있어서 객체 생성을 하고, 해당객체, 메소드명 으로 출력
	public static void main(String[] args) {
		Met1 met1 = new Met1();
		met1.method1();
		
		Met2 met2 = new Met2();
		met2.method2(100,200);
		
		Met3 met3 = new Met3();
		System.out.println(met3.method3());
		
		
		Met4 met4 = new Met4();
		System.out.println(met4.method4(100, 200));
	}

	public static void fnc1() {
		int x = 100;
		int y = 200;
		System.out.println(x+y);
	}
	
	public static void fnc2(int x, int y) {
		System.out.println(x+y);
	}
	public static int fn3() {
		int x = 100;
		int y = 200;
		return x+y;
	}
	public static int fnc4(int x, int y) {
		return x+y;
	}
}
