package com.kh.test5;
/*
 문제5. ArrayList를 이용해 다수의 Fruit객체를 저장 후 출력하려고 하는데 문제가 생겼다. 문제가 생긴 곳을 찾아 이유와 함께 [원인](15점)에 기술하고,
이를 해결한 코드를 [조치내용](15점)에 기술하시오. (총 30점)
 */
import java.util.ArrayList;
import java.util.List;
import  com.kh.test5.model.Fruit;

public class Application {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		
		list.add(new Fruit("사과","빨강"));
		list.add(new Fruit("메론","초록"));
		list.add(new Fruit("포도","보라"));
		list.add("바나나"); //문제원인: list(ArrayList)의 제너릭 타입은 Fruit로 설정되어 있으므로 String이 올수없으며 Fruit 으로 객체를 생성하여 요소를 추가하여야한다
						  // Type Error 발생
						  //해결방안: 해당행 삭제 혹은 list.add(new Fruit("바나나","노랑")); 수정 
		for(int i=0; i<list.length; i++) {//문제원인: Arraylist 컬렉션 프레임워크는  length라는 속성이 없다  Attribute Not Found Error 발생
			//해결방안: size() 메소드를 사용하여야한다 
			System.out.println(list[i].getName());//문제원인:[]인덱스는 배열객체에서 활용하는 연산자 이므로  
												  //Arraylist 인곳에 배열요소 참조 연산인 []가 사용되었음 
												  //해결방안 :list.get(i).getName() 을 사용하여야함
		}
	
		
		
	}

}
