package sec3;

import java.util.ArrayList;

//Class 타입의 List Stream 방식활용
class Visitor{
	private String name;
	private int age;
	private int price;
	
	public Visitor() {}
	
	public Visitor(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
}





public class Tour {

	public static void main(String[] args) {
		ArrayList<Visitor> vList = new ArrayList<>();
		Visitor v1 = new Visitor("김기태",43,1000);
		Visitor v2 = new Visitor("조대신",15,500);
		Visitor v3 = new Visitor("이종우",99,0);
		Visitor v4 = new Visitor("이원석",22,0);
		Visitor v5 = new Visitor("김응원",31,1000);
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		//Stream<Visitor>	vStream = vList.stream(); 이렇게해도됨
		System.out.println("객체 순회");
		vList.stream().forEach(vis-> System.out.println(vis.toString()));
		System.out.println("이름만 출력");
		vList.stream().map(vis ->vis.getName()).forEach(s->System.out.println
				(s));
		System.out.println("나이가 30이상인 사람만 정렬하여 출력");
		vList.stream().filter(vis -> vis.getAge()>=30).map(c-> c.getName()).sorted()
		.forEach(s->System.out.println(s));
				
		
	}

}
