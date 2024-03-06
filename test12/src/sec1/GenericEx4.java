package sec1;
class Point<T,V>{//좌표점 제너릭
  T x;  //x축에서의 (가로위치)
  V y;  //y축에서의 (새로위치)
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}

public class GenericEx4 {
	//제너릭 메소드 : 해당 클래스에 메소드로 반환타입에 관계없이 활용할 수 있는 메소드 
	
	public static <T,V> double makeRectangle(Point<T,V>p1,Point<T,V>p2) {
		 double left =((Number)p1.getX()).doubleValue();
		 double right =((Number)p2.getX()).doubleValue();
		 double top =((Number)p1.getX()).doubleValue();
		 double bottom =((Number)p2.getX()).doubleValue();
		 
		 double width =right -left;
		 double height=bottom-top;
		 
		 return width *  heigh
		 }
	public static void main (String[] args) {
		

	}

}
