package org.kh.object2;
//메서드(Method):정의 > 호출
public class Comput01 {
//유형1 반환x 매개변수x
void fnc1(/*매개변수*/) {
	System.out.println("메서드1");
}
//유형2 반환x 매개변수ㅇ
void fnc2(int a) {
	System.out.println(a+"를 입력하셧습니다");
}
//유형3 반환ㅇ 매개변수x
int fnc3() {
	return 1004;
}
//유형 4 반환ㅇ 매개변수ㅇ
 String fnc4(int point) {
	if(point<=80) { 
		return "불합격";
	} else {
		return "합격";
	}
 }
}
