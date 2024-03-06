package sec3;
//Deque : LIFO 와 FIFO 가 모두 가능한 구조 =>스택과 큐의 혼합 구조로서 양쪽에서 입력과 출력이 모두가능

import java.util.Deque;
import java.util.LinkedList;

public class DequeEx {

	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		//추가
		
		d.addFirst("자바");  //앞에넣으시오
		d.addFirst("파이썬");
		d.addLast("자바스크립트");
		d.addFirst("리액트");
		d.addLast("노드");//뒤에넣으시오
		d.addLast("스타일시트");
		
		System.out.println(d);
		System.out.println(d.peek());  //큐처럼 맨앞에꺼를 출력함
		System.out.println(d.peekLast());  //스택처럼 동작함  
		System.out.println(d.peekFirst());  //큐 처럼 동작함
		
		
		System.out.println(d.poll()); //큐처럼 출력후 맨앞에껄 제거함
		System.out.println(d.pollLast()); //스택처럼 출력후 맨뒤에껄 제거함
		System.out.println(d.pollFirst()); //큐처럼 출력후 맨앞에껄 제거함
	
		
		System.out.println(d.pop()); 
		
		
	}

}
