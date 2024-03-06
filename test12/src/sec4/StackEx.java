package sec4;

import java.util.Stack;

//스택(Stack) : 탑갗티 입력할때는 쌓아 올려지고,출력할 때는 반대로 맨 마지막에 입력한 가장 위에 입력된 데이터부터 출력됨
//LIFO(Last In First Out) -후입선출
public class StackEx {

	public static void main(String[] args) {
		Stack<String>stack = new Stack<String>();
		
		//요소 추가 push 넣는 순서대로 쌓아올린다  
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
		System.out.println(stack.pop()); //반환후 맨마지막글자 (맨꼭대기값을 제거)
		System.out.println(stack.pop());
		
		
	}

}
