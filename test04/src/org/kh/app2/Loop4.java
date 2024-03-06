package org.kh.app2;

import java.util.Scanner;

/*while : for(초기식;조건식;증감식) 와 마찬가지로 조건이 만족하는동안만 반복수행 그러나 wihlie의 괄호에 조건만기입
 해당 블록 안에 조건식과 증감식이 들어간다
 */
public class Loop4 {

	public static void main(String[] args) {
		/* 초기식
		   while (조건식){
		   반복할 문장;
		*/
		int i = 0 , tot = 0;
		while(i<=5) {
			 i++;    //i=i+1     //1 2 3 4  5 
			 tot+=i; //tot=tot+i //1 3 6 10 15 
		}
		System.out.println("결과 : "+tot);
		
		//Q.해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하시오
		   Scanner sc = new Scanner(System.in);
		   System.out.print("단:" );
		   int n= sc.nextInt();
		   int j= 0;
		   while(j<9) {
			j++;   
		   System.out.println(n+"*" + j + "=" + (n * j));
		   }
		
			   
		   }
		   
		}
}
