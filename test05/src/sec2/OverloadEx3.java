package sec2;

public class OverloadEx3 {

	public static void main(String[] args) {
		Board b1 = new Board();	//매개변수없는 방식으로 b1객체 생성
		b1.setBno(1);
		b1.setTitle("즐거운 자바 코딩~!");
		b1.setUname("abc");
		System.out.println(b1.toString());
	
		Board b2 = new Board(101); //bno가 있는 생성자 방식으로 b2객체 생성
		b2.setTitle("다음 주는 평가대비 해야징~!");
		b2.setUname("wolf");
		System.out.println(b2.toString());
		
		
		Board b3 = new Board(102, "오늘은 코딩 불금~!");//bno, title을 매개변수로 입력받아 b3 객체 생성
		b3.setUname("walkman");
		
		System.out.println(b3.toString());
		
		Board b4 = new Board(103, "주말은 코딩과 함께~!", "kkt09072");//bno, title, uname을 매개변수로 입력받아 b3 객체 생성
		
		System.out.println(b4.toString());
		
	}

}
