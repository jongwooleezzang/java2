package sec2;

public class CharStack {
		private StringBuffer stack;
		public CharStack() {
			stack = new StringBuffer();
		};
		public CharStack(int capacity) {
			stack = new StringBuffer(capacity);
		};
		public void push(char c) {
			stack =stack.append(c);
			
		}
		public int pop() {//�ѱ��ھ� ��������
			char ch= stack.charAt(stack.length()-1);
			stack = stack.deleteCharAt(stack.length()-1);
			return ch;
		}
		public char[] list() { //���ڹ迭�� ����
			char[] arr = {};
			return arr;
		}
		public String toSring() {//���ڹ迭�� ���ڿ��� ����
			return this.stack.toString();
		}
		
		
}
