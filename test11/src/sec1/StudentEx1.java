package sec1;

public class StudentEx1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = new Student();
		su2 = su1; //얕은복제
		Student su3 = (Student) su1.clone();
		System.out.println(su1.getClass().toString());//해당 객채의 클래스이름 출력
		System.out.println(su1 instanceof Student);//su1 인스턴스가 Student 클래스로 생성된것인지 유무를확인 
		System.out.println(su1.toString());//주소만 출력(현재 su1 객체에 대한 stack에있는 heap의 위치를16진수로출력
		System.out.println(su1.equals(su2)); //두 객체가 같은지 확인
		System.out.println(su1.hashCode()); //해쉬코드(16진수를 10진수로 바꾼)라는 주소가나옴
		//su3 과 su1의 주소가 달라 false
		//System.out.println(su3.equals(su1));
		//student 클래스에 equals를 모든 맴버변수에 대하여 비교하는 오버라이딩을 해주면 값 비교가 가능하다.
		
	}
	
		
	
}



