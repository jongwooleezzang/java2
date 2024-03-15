package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
	//문제3. int 자료형만 저장할 수 있는 List를 만들어 양수, 음수, 0을 임의로 저장한 후
	//List에 저장된 값을 순서대로 꺼내어 양수, 음수, 0일때 출력되는 방법을 서로 다르게 지정하는 코드를 작성하였으나 
	//오류 발생 및 정상 수행되지 않았다.
	//요구사항과 소스 코드를 분석하여 원인(문제점 + 발생 원인), 조치 내용(해결 방법 + 수정된 코드)을 작성하시오.

	//* 요구 사항
	//1. List에서 꺼낸 요소의 값이 양수 또는 음수이면 절대 값의 크기만큼 반복하며 문자를 출력
	//2. 양수일 경우 '+', 음수일 경우 '-'
	//3. List에서 꺼낸 요소의 값이 0인경우 "@@@@@@@@@@" 한 줄을 출력
	//* Test3 클래스 => Test3.jpg 참조
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //List<Integer> list = null;	//list 선언만 있으므로 객체 생성이 되어 있지 않아 NullPointerException이 발생
				
				list.add(4);
				list.add(-5);
				list.add(0);
				list.add(-3);
				list.add(2);
				list.add(1); //list.add(1.23456);	//List의 선언시 요소의 데이터 타입이 Integer로 설정되어 있으므로 정수만 입력 받을 수 있으므로 데이터 타입 오류 발생

				for(int num : list) {
					char ch;
					
					if(num < 0) { //if(num <= 0) {	//if문의 조건에서 0을 포함하여 음수라고 표현했으므로 0이어도 음수가 발생하고, 0인 경우의 정상으로 처리되어야 할 else문이 실행되지 않는 오류 발생
						ch = '-';
					} else if(num > 0) {
						ch = '+';
					} else {
						System.out.println("@@@@@@@@@@");
						continue;
					}
					
					//int Math.abs(정수) : 정수의 절대값을 반환
					for(int i=1 ; i<=Math.abs(num) ; i++) { //for(int i=1 ; i<Math.abs(num) ; i++) { //for 반복문의 실행 조건이 해당 숫자를 포함하는 것이 아닌 작을 때까지만 실행하게 되어 => 해당 숫자의 횟수 만큼 부호를 출력해야 되는데 한 번씩 덜 출력
						System.out.print(ch); 
					}
					System.out.println();
	}

	}
}
