package sec4;

import java.util.Stack;

//����(Stack) : ž��Ƽ �Է��Ҷ��� �׾� �÷�����,����� ���� �ݴ�� �� �������� �Է��� ���� ���� �Էµ� �����ͺ��� ��µ�
//LIFO(Last In First Out) -���Լ���
public class StackEx {

	public static void main(String[] args) {
		Stack<String>stack = new Stack<String>();
		
		//��� �߰� push �ִ� ������� �׾ƿø���  
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.push("f");
		stack.push("g");
		stack.push("h");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop()); //��ȯ�� �Ǹ��������� (�ǲ���Ⱚ�� ����)
		System.out.println(stack.pop());
		
		
	}

}
