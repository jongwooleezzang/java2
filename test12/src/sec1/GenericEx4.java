package sec1;
class Point<T,V>{//��ǥ�� ���ʸ�
  T x;  //x�࿡���� (������ġ)
  V y;  //y�࿡���� (������ġ)
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
	//���ʸ� �޼ҵ� : �ش� Ŭ������ �޼ҵ�� ��ȯŸ�Կ� ������� Ȱ���� �� �ִ� �޼ҵ� 
	
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
