package secprcatice;

public class LunchEx1 {

	public static void main(String[] args) {
		Lunch food;
		System.out.println("�ѽĸ޴�");
	    food = new kor();
	    food.eat("�����");
			
	    System.out.println("�߽ĸ޴�");
	    food = new chin();
	    food.eat("��ǳ��");
	    
	    System.out.println("�Ͻĸ޴�");
	    food = new jap();
	    food.eat("��ġ�ʹ�");
	}

}
