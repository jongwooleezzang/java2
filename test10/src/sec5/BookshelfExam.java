package sec5;
//Queue : FIFO (First In First Out ����)=>�½�ũ �۾� ����
//Stack : LIFO (Last In First Out ����) =>�ֱ��۾���� ==�������۾�����̰����������
public class BookshelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf();
		que.enQueue("���ǻ�����");
		que.enQueue("�溹�� �ȳ�");
		que.enQueue("���ʹ� �� �ѷ�����");
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
	}

}
