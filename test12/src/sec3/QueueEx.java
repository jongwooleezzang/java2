package sec3;

import java.util.LinkedList;
import java.util.Queue;

//Queue: FIFO =>선입선출 : 먼저 입력한 데이터가 먼저 출력되는 자료구조
//자바에서는 Queue가 인터페이스 이므로 같은 구조를 가진 LinkedList를 이용하여 생성한다.

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		//큐 Queue 요소 추가 offer
		q.offer("a");
		q.offer("b");
		q.offer("c");
		q.offer("d");
		q.offer("e");
		q.offer("f");
		q.offer("g");
		
		System.out.println(q.peek());// 처음넣은게 나온다
		System.out.println(q.poll());//poll 이 스택에서 pop역할을함
		System.out.println(q.poll());
		System.out.println(q);
		
		

	}

}
