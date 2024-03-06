package sec1;
/*
Q.교재(Book) 클래스를 작성하되 교재코드(bno),교재명(bname),가격(price),저자(aouthor),출판사(pub)
등을 요소로 하며, 직접 접근이 되지 않도록 정보은닉을 하고, getter/setter 등을 작성하며 
출력 메소드print()를 추가 작성하되 매개변수의 개수에 따라 출력 될수 있도록 하시오.
*/
public class Book1 {
	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	//교재명(bname), 가격(price), 저자(author)
	//메소드 오버로드(Method overload)
	public void print() {
		System.out.println("교재 정보");
	}
	public void print(String bname) { 
		System.out.println("교재명 : "+bname);
	}
	public void print(int price) { 
		System.out.println("교재가격 : "+price);
	}	
	public void print(String bname, int price) { 
		System.out.println("교재명 : "+bname);
		System.out.println("교재가격 : "+price);
	}	
	public void print(String bname, int price, String author) { 
		System.out.println("교재명 : "+bname);
		System.out.println("교재가격 : "+price);
		System.out.println("저자 : "+author+"\n");
	}
	//getter,setter
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	@Override
	public String toString() {
		return "Book1 [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
				+ "]";
	}
	
	
}	