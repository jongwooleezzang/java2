package sec3;

import java.util.ArrayList;

//Class Ÿ���� List Stream ���Ȱ��
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
		Visitor v1 = new Visitor("�����",43,1000);
		Visitor v2 = new Visitor("�����",15,500);
		Visitor v3 = new Visitor("������",99,0);
		Visitor v4 = new Visitor("�̿���",22,0);
		Visitor v5 = new Visitor("������",31,1000);
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		//Stream<Visitor>	vStream = vList.stream(); �̷����ص���
		System.out.println("��ü ��ȸ");
		vList.stream().forEach(vis-> System.out.println(vis.toString()));
		System.out.println("�̸��� ���");
		vList.stream().map(vis ->vis.getName()).forEach(s->System.out.println
				(s));
		System.out.println("���̰� 30�̻��� ����� �����Ͽ� ���");
		vList.stream().filter(vis -> vis.getAge()>=30).map(c-> c.getName()).sorted()
		.forEach(s->System.out.println(s));
				
		
	}

}
