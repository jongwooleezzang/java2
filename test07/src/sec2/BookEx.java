package sec2;

public class BookEx {

	public static void main(String[] args) {
		//5���� Book �迭 ����
		Book[] book = new Book[5];
		for(int i=0; i<5; i++) {
			book[i] = new Book("å ����:"+i,"���� :"+i);
			System.out.println(book[i].toString());
		}
		book[1] = new Book("�ڹ�1","a");
		book[2] = new Book("�ڹ�2","b");
		book[3] = new Book("�ڹ�3","c");
		book[4] = new Book("�ڹ�4","d");
		book[5] = new Book("�ڹ�5","e");
		for(int i=0; i<5;i++ );
		System.out.println();
	}
	

}
