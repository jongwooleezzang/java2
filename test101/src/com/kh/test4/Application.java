package com.kh.test4;
/*
  문제4. 다음 코드는 잘못된 코드이다. 잘못된 부분과 이유를 [원인](10점)에 모두 기술하고, 올바르게 구동되도록 고친 코드를 [조치내용](10점)에 작성하시오. 
(총 20점) 
 */
//원인:Person을 구성하는 클래스가 없다 
import com.kh.test4.model.Person;

public class Application {

	public static void main(String[] args) {
		Person [] pArr = new Person[3]; //선언만된것 
		
			pArr[0] = new Person("이종우"); //조치사항: 초기화되어있지않은  pArr[] 배열에 Person 객체를 생성하여 각 요소에 생성된 객체를 대입
			pArr[1] = new Person("이종우2");
			pArr[2] = new Person("이종우3");
			
			for(int i=0; i< pArr.length; i++) {// 실제 선언한 배열의 개수보다 더많은 반복이 실행된다 =>ArrayIndexOutofBounds Exception발생
				System.out.println(pArr[i].getName());//person 의 배열요소이 pArr 객체가 초기화값이 대입되어 있지않아=>NullPointerException발생
		}   
	}
}
