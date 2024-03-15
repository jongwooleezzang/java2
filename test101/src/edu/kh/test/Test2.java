package edu.kh.test;
//문제2. 무한히 반복하며 입력 받은 이름을 List에 저장하는 코드를 작성하였으나 오류 발생 및 정상 수행되지 않았다.
//요구사항과 소스 코드를 분석하여 원인(문제점 + 발생 원인), 조치 내용(해결 방법)을 작성하시오.

//* 요구 사항
//1. 이름 입력 시 "exit"가 입력되면 반복을 종료 후 목록에 저장된 모든 이름 출력
//2. 이름 입력 시 "clear"가 입력되면 목록에 저장된 모든 이름 삭제
//3. 입력된 이름이 이미 목록에 존재하면 "이미 존재하는 이름입니다" 출력 및 추가X

//* Test2 클래스 => Test2.jpg 참조
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			List<String> nameList = new ArrayList<String>();

			while(true) {
				System.out.print("추가할 이름을 입력하세요 : ");
				String name = sc.next();
				
				if(name.equals("clear")) { //if(name == "clear") { //String 비교는 ==이 아니고, equals()를 써야 하므로 ==를 사용하였을 경우 정상비교가 되지 않는다.
					System.out.println("이름 목록을 초기화 합니다.");
					nameList.clear();
					 continue; //continue 구문이 실행해야할 다른 문장보다 앞서 있어서 continue 구문 이후의 문장이 실행되지 못함.
				}	
				if(name.equals("exit")) { //if(name == "exit") { //String 비교는 ==이 아니고, equals()를 써야 함.
					System.out.println("<<입력 종료>>");
					break; //return ;	//return가 입력될 경우 아래 반복출력 문장을 실행하지 못하고, main 함수(메소드)의 밖으로 탈출해버린다. 
				}
				if(nameList.contains(name)) {
					System.out.println("<이미 존재하는 이름입니다>");
				} else {
					nameList.add(name); //이름목록(nameList)에 이름을 추가하는 구현 코드의 누락으로 인해 추가하지 못함.
					System.out.println(name + " 추가 완료");
				}
			}
			//System.out.println("이름을 출력합니다.");
			for(String name : nameList) {
				System.out.println(name);
			}
	}

}
