package sec1;
//제일중요한거!!!: 참조형은 equals 로 값비교해야함 == 으로하면안됨

public class Exam1 {
	public static void main(String[] args) {
		int a = 1004;	//참조형
		int b = 1004;
		System.out.println("a==b :" + (a==b));  //단순 값 비교
		
		String s1 = "김기태"; //문자는 기본형도 참조형도 아니다.
		String s2 = "김기태";
		System.out.println(s1==s2); //문자열의 값 비교  (틀림)
		System.out.println("s1 equals s2 : "+(s1.equals(s2))); //맞는 문자열의 값비교 (맞음) //String 은 클래스연산을 해야하므
		
		Integer c = new Integer(1004);	//참조형
		Integer d = new Integer(1004);
		
		System.out.println("a==c  :"+ (a==c));	//기본형과 참조형의 비교는 값비교 
		System.out.println("c==d  :"+ (c==d)); //참조형 과 참조형의 비교는 주소비교 
		System.out.println("c equals d : "+(c.equals(d)));//참조형끼리의 비교는 equals 를써야함
		
		
	}
	
}

