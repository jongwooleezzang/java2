package sec5;
//Queue : FIFO (First In First Out 구조)=>태스크 작업 순서
//Stack : LIFO (Last In First Out 구조) =>최근작업목록 ==마지막작업목록이가장먼저나옴
public class BookshelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf();
		que.enQueue("관악산등산경로");
		que.enQueue("경복궁 안내");
		que.enQueue("숭례문 명동 둘러보기");
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
	}

}
