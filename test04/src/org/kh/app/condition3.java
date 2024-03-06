package org.kh.app;
import java.util.Scanner;
//조건문 if~elseif(~else~)
public class condition3 {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력[0~100]:");
		int point = scan.nextInt();
		char result; 
		/*학점은 점수(point)가 90~100 이면 'A', 80~89이면, 'B'
		 * 70~70이면 , 'B', 60~69이면, 'F'
		 */
		if(point>=90)
		{
			result = 'A';
		}
		else if(point>=80) {
			result = 'B';
		}
		else if(point>=70) {
			result = 'C';
		}
		else if(point>=60) {
			result = 'D';
	    }
		else {
			result = 'F';
		}
		
		
		
		System.out.printf("당신의 점수는 %d점 입니다.",point);
		System.out.println("당신의 학점은"+result +"입니다");

		
	
	
	
	
	
	}

}
