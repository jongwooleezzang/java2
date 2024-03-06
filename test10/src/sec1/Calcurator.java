package sec1;
/*
Q1
계산기(Calcurator)인터페이스
     맴버
    double PI = 3.1415;	
	int ERROR = -999999999;
	int add(int num1,int num2);
	int subtrack(int num1,int num2);
	int multiply(int num1,int num2);
	int divide (int num1,int num2);
	
중계기(Repeator) 추상 클래스 : Calcurator 를 상속받는 추상 클래스
	 int add(int num1 int num2):두수 (num1,nu2)의 덧셈 구현
	 int subtract(int num1 int num2):두수 (num1,nu2)의 뺼셈 구현
	 int power(int num1,int num2):추상메소드
	
연산기(ArithmaticEx1) 구현 클래스 : Rereator 를 상속받은 구현 클래스
   int multiply : (int num1 ,int num2)  
   int divide (int num1 ,int num2)  : 두수 (int num1 ,int num2) 의 나눗셈 구현
   int power(int num1 ,int num2)  : num1 num2 승에대한 수를 구현 
   print():"계산기, 중계기, 연산기를 구현합니다" 를출력
*/
public interface Calcurator {
	double PI = 3.1415;	//인터페이스에 필드를 선언하면, 상수(final static)이 된다.
	int ERROR = -999999999;
	int add(int num1,int num2);
	int subtract(int num1,int num2);
	int multiply(int num1,int num2);
	int divide (int num1,int num2);
}
