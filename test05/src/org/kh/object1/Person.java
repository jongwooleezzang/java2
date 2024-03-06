package org.kh.object1;
/*객체(Object):필요에 따라서 클래스로 부터 객체를 생성하여 활용한다
클래스:맴버 변수(Field 필드=속성)
     맴버 메서드(Method): 사용자 정의 메소드,getter setter 등
	  생성자 함수(Contsructer-객체 생성) :클래이 이름과 같아야함

접근제어자 class 클래스명 {
      접근제어자[지시자] 타입 필드명;
      접근제어자 생성자 함수(){객체생성코드;}
      접근제어자 [지시자] 반환타입 메소드명([매개변수]){처리문장;}
      }
      
      객체생성시 
      클래스명 인스턴스(객체) 명 = new 생성자함수()
      
      Person kim = new Person();
      kim.name ="김기태";
      kim.year =1981;
      kim.gender="남성"
      kim.job ="미치광이 개발자"
      kim.running();       
*/
public class Person {
	String name;
	int year;
	String gender;
	String job;
	void running() {
		System.out.println(this.name+"가 달립니다.");
	}
}


