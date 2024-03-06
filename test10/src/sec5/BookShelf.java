package sec5;
//두개의 인터페이스 상속 =>각 각의 인터페이스에 선언된 메소드를 하나의 클래스로 합치기
//public class 자식클래스 implements 인터페이스1 ,인터페이스2{}
//두개의 클래스 상속은 허용하지 않으므로 하나의 부모클래스와 자식클래스 형태로 만들고, 후손클래스에서 메소드나 메소드나 필드를 합친다
//public class 자식클래스 extends 부모클래스{}
//public class 후손클래스 extends 자식클래스{}
//하나의 클래스와 하나의 인터페이스 상속 =>클래스는 필드 ,생상자  인터페이스는 메소드를 하나의 클래스로 합치게함
//public class 자식클래스 extends 부모클래스 {} implements 인터페이스{}
public class BookShelf extends Shelf implements Queue{// 같은유형인 클래스는 extends 인터페이스유형인 큐는 implemensts

	@Override
	public void enQueue(String title) {
		shelf.add(title);   //이거 왜오류남?
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
