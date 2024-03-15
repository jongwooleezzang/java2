package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		while(true) {
			System.out.print("추가할 이름을 입력하세요 : ");
			String name = sc.next();
			
			if(name.equals("clear")) { //String  비교는 ==이 아니라  .equal을 써야한다 ==를 쓰면 정상비교가 되지않는다
				System.out.print("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue; //컨티뉴를 앞에 써버리면 컨티뉴 이후의 문장을 실행하지 않고 다시 처음으로 되돌아가기때문에  뒤로옴긴다
			}
			if(name.equals("exit")) {
				System.out.print("<<입력종료>>");
				break;   //return을 사용하면  아래 출력문을 출력하지못하고 메인함수 밖으로  탈출해버리기때문에 break를 사용한다
			}
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다.>");
			}else {
				nameList.add(name);
				System.out.println(name+"추가완료");
			}
		}
		  System.out.println("이름을 출력합니다.");
	        for(String name : nameList) {
	            System.out.println(name);
	        }
	}
}
