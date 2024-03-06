package src3;

public class PeopleEx {

	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 200;		//people.selNum = 200 와 동일 == 정적필드 == 공유데이터
		p1.name	  = "이종우";		//인스턴스 변수 == 동적 필드
	    p1.age	  = 31;
		p1.addr	  ="전농동";
		
		System.out.println(p1.selNum+"," +p1.name);
		
		
		People p2 = new People();
		p2.selNum =300;
		p2.name="박동빈";
		System.out.println(p1.selNum+"," +p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		p1.print1();
		p1.print2();
		
		
		
		//정적(static) 메소드 :객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소드
		people
	}
}
