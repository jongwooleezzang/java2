package sec3;

import java.util.LinkedList;
import java.util.Queue;

//Queue: FIFO =>���Լ��� : ���� �Է��� �����Ͱ� ���� ��µǴ� �ڷᱸ��
//�ڹٿ����� Queue�� �������̽� �̹Ƿ� ���� ������ ���� LinkedList�� �̿��Ͽ� �����Ѵ�.

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		//ť Queue ��� �߰� offer
		q.offer("a");
		q.offer("b");
		q.offer("c");
		q.offer("d");
		q.offer("e");
		q.offer("f");
		q.offer("g");
		
		System.out.println(q.peek());// ó�������� ���´�
		System.out.println(q.poll());//poll �� ���ÿ��� pop��������
		System.out.println(q.poll());
		System.out.println(q);
		
		

	}

}
