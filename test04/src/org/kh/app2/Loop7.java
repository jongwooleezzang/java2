package org.kh.app2;

import java.util.Random;

public class Loop7 {

	public static void main(String[] args) {
		//Q.1부터 45까지 무작위 숫자가 나오는 로또 추첨기를 만들어라
		int min = 1 , max = 45;
		Random r = new Random();
		for(int i=0;i<6;i++) {
			int val = r.nextInt(max + min) + min;
			System.out.println(val);
		}
		
   }
}

