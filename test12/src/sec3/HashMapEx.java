package sec3;

import java.util.HashMap;
import java.util.Map;

//자료구조 (자료의 논리적인 저장 원리에 따른 구조)
//1. 단순구조(Primitive) :정수,실수,문자,문자열,논리형
//2. 선형구조(Sequence)  :배열(Array), 리스트(List), 스택(Stack), 큐(Queue) //참조형
//3. 비선형 구조(Non-Sequence): 맵(Map), 트리(Tree), 그래프(Graph), 셋(Set)
public class HashMapEx {

	public static void main(String[] args) {
		//선언방법
		Map<String ,String> map0 = new HashMap<String,String>();
		HashMap<String ,String> map1 = new HashMap<String,String>();
		HashMap<String ,String> map2 = new HashMap<String,String>();
		HashMap<String ,String> map3 = new HashMap<>();
		
		HashMap<String ,String> map4 = new HashMap<>(10);
		HashMap<String ,String> map5 = new HashMap<>(10, 0.7f);//loaS
		HashMap<String ,String> map6 = new HashMap<>(){{
			put("name","김기태");
		}};
		
	}

}
