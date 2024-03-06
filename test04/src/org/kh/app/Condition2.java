package org.kh.app;
// 조건문 if~else : if(조건식) {조건이 참일때 실행문;} else { 조건이 거짓일때 실행문 }
public class Condition2 {

	public static void main(String[] args) {
		char cel ='1'; //char 는 작은따옴표
	//성별코드(sel)가 1이거나 3이면 ,성별이 "남성" , 아니면, "여성"
		String gender ;
		 if(cel=='1'|| cel=='3') 
		 {
			 gender="남성";
		 }
		 else {
				 gender="여성";
	 }
		 
		 
		 System.out.printf("%n당신의성별은 %s", gender);
		
		

	}

}
