package org.kh.object1;
/*객체(Object):필요에 따라서 클래스로 부터 객체를 생성하여 활용한다
클래스:맴버 변수(Field 필드=속성)
     맴버 메서드(Method): 사용자 정의 메소드,gettet setter 등
	  생성자 함수(Contsructer-객체 생성) :클래이 이름과 같아야함

접근제어자 class 클래스명 {
      접근제어자[지시자] 타입 필드명;
      접근제어자 생성자 함수(){객체생성코드;}
      접근제어자 [지시자] 반환타입 메소드명([매개변수]){처리문장;}
      }
      
      객체생성시 
      클래스명 인스턴스 명 = new 생성자함수()
      
      Person kim = new Preson();
      kim.name ="김기태";
      kim.year =1981;
      kim.gender="남성"
      kim.job ="미치광이 개발자"
      kim.running();       
*/
/*
Q2 회원(Member) 클래스를 작성화되,아이디(id),비밀번호(pw),이메일(email),생년(birth),전화번호(tel)
등을 요소로 하고 회원 정보를 출력하는 메서드(toString())를 작성하시오
*/
//public (모든패키지나클래스) > protected(동일패키지거나 다른패키지지만 상송받은경우)  > default(동일패키지) > private(동일클래스)
public class Member {
	private String id;
	private String pw;
	private String email;
	private int birth;
	private String tel;
	//프리빗 걸린 필드는 직접 접근이불가능하다
	//setter를 만들어서 저장할수있다록한다
	@Override // 오버라이드:메소드를 상송받아 내용을 변환하여 정의하는것
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
