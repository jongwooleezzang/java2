package edu.kh.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("2 ~ 9 사이 정수 입력 :");
			
			int input = sc.nextInt();//nextint(); 으로바꾼다
			
			if(input <= 9 && input>1 ) {
				for(int num =1 ; num <=9 ; num++) {
					System.out.printf("%d * %d =%d\n" , input , num, input*num);
				}
				break;
				 
			 }else {
				 System.out.println("2이상 9이하의 정수만 입력해주세요.");
			 }
		}
	}

}


