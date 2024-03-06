package src3;
//Scope: 특정 변수가 영향을 미치는 범위
public class SocpeEx {
	int a = 10;  //전역변수 :클래스 전체에서 인지되는 변수지만,특정 메소드 내에서는 인지하지 못함
	static int b =100;	//클래스 변수: 클래스 전체에서 인지되며 ,특정 메소드 내에서도 인지함 =>Global Scope
	public static void main(String[] args) {
		int a = 20; //지역변수 : 특정 메소드 내에서 선언되어 활용되는 변수로서 함수 블록을 벗어나면 ,인지할수 없다 =>Local Scope
		System.out.println("지역변수 a="+a);
		run();
		run(30);
	}
	public static void run()	{
		System.out.println("b="+b);
		System.out.println("클래스 변수b="+b);
	}
	public static void run(int a)	{//매개변수:메소드 정의시 괄호 안에 있는 변수로 호출시 지정된값을 저장한다=>Local Scope
		System.out.println("매개변수 a="+a);
	}
}
