package edu.kh.test1;

import java.util.Scanner;

public class Tes02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] memberArr = {"홍길동","김성훈","윤웅식","윤성우","남궁인"};
		System.out.print("검색할 회원 이름을 입력하시오 : ");
		String searhName =sc.next(); //=> Sc.nextInt =>.nextString 으로바꿈
		
		boolean result = false;
		
		for(int i=0 ; i<=memberArr.length ; i++) {//1 => 0으로바꿈
			if(memberArr[i].equals(searhName)) {
				result =true ;
				break;
			}else {
				result =false ;
				break;
			}
		}
		  if(result) {
			  System.out.println("회원이 존재합니다."); //=> 회원이 존재합니다로 수정
		  }else {
			  System.out.println("회원이 존재하지않습니다."); //=> 회원이 존재하지 않습니다로 수정
		  }
		
	}
}

	

	

	
