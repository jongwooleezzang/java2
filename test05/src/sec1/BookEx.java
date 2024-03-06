package sec1;

public class BookEx {

	public static void main(String[] args) {
		//교재 관리자가 교재 3권을 등록
		
		Book1 b1 = new Book1();
		b1.setBno(1);
		b1.setBname("가나다");
		b1.setPrice(1000);
		b1.setAuthor("마바사");
		b1.setPub("아자차");
		System.out.println(b1.toString());
		
		b1.print(b1.getBname());
		b1.print(b1.getBname(),b1.getPrice());
		b1.print(b1.getBname(),b1.getPrice(),b1.getAuthor());

		Book1 b2 = new Book1();
		b2.setBno(2);
		b2.setBname("abc");
		b2.setPrice(2000);
		b2.setAuthor("efg");
		b2.setPub("hij");
		System.out.println(b2.toString());
		
		
		Book1 b3 = new Book1();
		b3.setBno(3);
		b3.setBname("123");
		b3.setPrice(3000);
		b3.setAuthor("456");
		b3.setPub("789");
		System.out.println(b3.toString());
		
		b1.print(b1.getBname(), b1.getPrice(), b1.getAuthor());
		b2.print(b2.getBname(), b2.getPrice(), b2.getAuthor());
		b3.print(b3.getBname(), b3.getPrice(), b3.getAuthor());
		
	
		
	}
	

}
