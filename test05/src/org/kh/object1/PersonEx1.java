package org.kh.object1;

public class PersonEx1 {

	public static void main(String[] args) {
		Person Lee = new Person();
		Lee.name  = "이종우";
		Lee.year  = 1994;
		Lee.gender = "남성";
		Lee.job ="학생";
		Lee.running();
		
		Person kim = new Person();
		kim.running(); //kim의 이름이 정해지지않음 null로 출력됨
	}

}

