package org.kh.app;

import java.util.Scanner;

public class Condition4 {
//조건문 다단계 if
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력[0~100]:");
		int point = scan.nextInt();
		String result;
		String reward;
		/* result 는 point 가
		 * 97~100 이면 A++ , 93~96 A0 , 90~92  A-
		 * 87~89  이면 B++ , 83~86 B0 , 80~92  B-
		 * 77~79  이며 C++ , 73~76 C0 , 70~72  C-
		 * 67~69  이면 D++ , 63~66 D0 , 60~62  D-
		 * 60점 미만이면 F 로 하되 다단계 if 와 / elseif/ else 문 활용
		 * 시상내용은 학점이A++ 이면 학업우수상 , A0 이면 노력상 , 나머지는''으로 하되 ,switch~case~문 활용   
		*/
		if(point>=97)
		{
			result = "A++";
		}
		else if(point>=93) {
			result = "A0";
		}
		else if(point>=90) {
			result = "A";
		}
		else if(point>=87) {
			result = "B++";
	    }
		else if(point>=83) {
			result = "B-";
		}
		else if(point>=79) {
			result = "C++";
	    }
		else if(point>=76) {
			result = "C0";
		}
		else if(point>=72) {
			result = "C-";
	    }
		else if(point>=69) {
			result = "D++";
		}
		else if(point>=66) {
			result = "D0";
	    }
		else if(point>=62) {
			result = "D-";
	    }
		else if(point>=60) {
			result = "F";
		}
		System.out.printf("당신의 점수는 %d점 입니다.",point);
		System.out.println("당신의 학점은" + ,result +"입니다");

		
		
		
		
		
		
	}

}
