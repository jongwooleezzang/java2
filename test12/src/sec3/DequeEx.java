package sec3;
//Deque : LIFO �� FIFO �� ��� ������ ���� =>���ð� ť�� ȥ�� �����μ� ���ʿ��� �Է°� ����� ��ΰ���

import java.util.Deque;
import java.util.LinkedList;

public class DequeEx {

	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		//�߰�
		
		d.addFirst("�ڹ�");  //�տ������ÿ�
		d.addFirst("���̽�");
		d.addLast("�ڹٽ�ũ��Ʈ");
		d.addFirst("����Ʈ");
		d.addLast("���");//�ڿ������ÿ�
		d.addLast("��Ÿ�Ͻ�Ʈ");
		
		System.out.println(d);
		System.out.println(d.peek());  //ťó�� �Ǿտ����� �����
		System.out.println(d.peekLast());  //����ó�� ������  
		System.out.println(d.peekFirst());  //ť ó�� ������
		
		
		System.out.println(d.poll()); //ťó�� ����� �Ǿտ��� ������
		System.out.println(d.pollLast()); //����ó�� ����� �ǵڿ��� ������
		System.out.println(d.pollFirst()); //ťó�� ����� �Ǿտ��� ������
	
		
		System.out.println(d.pop()); 
		
		
	}

}
