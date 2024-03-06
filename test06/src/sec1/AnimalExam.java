package sec1;

class Animal {
	private String type;
	private String name;
	private int leg;
	private int wing;
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", leg=" + leg + ", wing=" + wing + "]";
	}
	public void print() {
		System.out.println(this.toString());
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
}


public class AnimalExam {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.setType("포유류");
		ani.setName("호랑이");
		ani.setLeg(4);
		ani.setWing(2);
		ani.print();
		
		Animal bird = new Animal();
		bird.setType("조류");
		bird.setName("독수리");
		bird.setLeg(2);
		bird.setWing(2);
		bird.print();
		
		
		
		
		
		
		
		
	}




}
