package org.kh.java;

public class Constant1 {

	public static void main(String[] args) {
//상수(Constant)와 리터럴(Literal)
		final int MAX_POINT =100;
		final int MIN_POINT =0;
		final double PI = 3.141592;
		final String MY_NAME = "이종우"; // 상수는 값 변경이 되지 않는다
		/* 위와같이 final 지시자가 선언되고, 대문자로 표기된 것을 상수라고하며
	항상 값이 같아 더이상 변할수 없는 값을 뜻함
	*/
//변수나 상수에 대입되는 값을 리터럴(Literal)	
		System.out.println("최고점수"+MAX_POINT);
		System.out.println("최소점수"+MIN_POINT);
		System.out.println("나의이름"+MY_NAME);
		System.out.println("반지름이 10인 원의 둘레길이:"+10*2*PI);
	}

}
