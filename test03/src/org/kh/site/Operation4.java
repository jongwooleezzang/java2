package org.kh.site;
//증감연산 : ++,--  >> 전위연산 , 후위 연산이 각 각 있음 (총4개)

public class Operation4 {
	public static void main(String[] args) {
  int a=10;
  int b=10;
  //a++ >> a=a+1
  System.out.println("전위 증가 연산:"+(++a)); //출력값은 11이고 a값도 11이다
  System.out.println("후위 증가 연산:"+(b++)); //출력값은 10이지만 b값은 11이다
 System.out.println("전위 감소 연산:"+(--a)); //출력값은 9이고 a값도 9이다
 System.out.println("후위 감소 연산"+(b--)); //출력값은 10이지만 b값은 9이다
 
  
		 
		
		
		
		
	}

}
