package sec1;

public class Staff extends User {
	private int level ;		//���ٷ���
	private String part;	//�ٹ��μ�
	private String name;    //�̸�
	//getter.setter
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Staff [level=" + level + ", part=" + part + ", name=" + name + "]";
	}
	@Override
	public void connect() {
		System.out.println(name+"��(��) ����Ͽ����ϴ�.");
	}
}
