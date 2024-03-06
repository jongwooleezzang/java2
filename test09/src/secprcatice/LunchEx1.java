package secprcatice;

public class LunchEx1 {

	public static void main(String[] args) {
		Lunch food;
		System.out.println("한식메뉴");
	    food = new kor();
	    food.eat("된장찌개");
			
	    System.out.println("중식메뉴");
	    food = new chin();
	    food.eat("깐풍기");
	    
	    System.out.println("일식메뉴");
	    food = new jap();
	    food.eat("참치초밥");
	}

}
