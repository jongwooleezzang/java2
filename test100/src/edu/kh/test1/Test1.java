package edu.kh.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("2 ~ 9 ���� ���� �Է� :");
			
			int input = sc.nextInt();//nextint(); ���ιٲ۴�
			
			if(input <= 9 && input>1 ) {
				for(int num =1 ; num <=9 ; num++) {
					System.out.printf("%d * %d =%d\n" , input , num, input*num);
				}
				break;
				 
			 }else {
				 System.out.println("2�̻� 9������ ������ �Է����ּ���.");
			 }
		}
	}

}


