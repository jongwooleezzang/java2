package sec2;

public class BookEx {

	public static void main(String[] args) {
		//5개의 Book 배열 선언
		Book[] book = new Book[5];
		for(int i=0; i<5; i++) {
			book[i] = new Book("책 제목:"+i,"저자 :"+i);
			System.out.println(book[i].toString());
		}
		book[1] = new Book("자바1","a");
		book[2] = new Book("자바2","b");
		book[3] = new Book("자바3","c");
		book[4] = new Book("자바4","d");
		book[5] = new Book("자바5","e");
		for(int i=0; i<5;i++ );
		System.out.println();
	}
	

}
