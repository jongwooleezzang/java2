package sec1;

import sec2.Student;

public class GenericEx {

	public static void main(String[] args) {
		//생성자에 대한 제너릭의 타입 생략 가능 -자바 1.7이상 1.8부터
		Generic1<Student> s  = new Generic1<Student>();	
		Student a = new Student("장원영" , 21);
		
	}
}