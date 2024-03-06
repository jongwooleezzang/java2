package org.kh.object1;
/*
 * Q 학생(Student) 클래스를 작성하고 ,해다 학생의 점수(kor,eng,mat)와 tot와 avg를 구하여
출력하는 resulting() 메서드가 있도록 하시오.
*/
public class Student {
	
	String name;
	int kor;
	int eng;
	int mat;
	
	public int tot() {
		return kor+eng+mat;
	}
	double avg() {
		return (kor+eng+mat)/3.0f;
	}
	void resulting() {
		System.out.println("이름 :" +this.name+"\n총점 :" +this.tot() +"\n평균 :"+avg());
	}
}

