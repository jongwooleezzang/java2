package exam152p;

public class Man {
private int age;
private String name;
private boolean gender;
private boolean marry;
private int baby;

/*public Man() {};

public Man(int age, String name, boolean gender, boolean marry, int baby) {
	super();
	this.age = age;
	this.name = name;
	this.gender = gender;
	this.marry = marry;
	this.baby = baby;
}
*/
public void print() {
	System.out.println("����: "+age);
	System.out.println("�̸�: "+name);
	System.out.print("����: ");
	if(gender) {
		System.out.println("����");
	} else {
		System.out.println("����");
	}
	
	System.out.print("��ȥ����: ");
	if(marry) {
		System.out.println("��ȥ");
	} else {
		System.out.println("��ȥ");
	}
	System.out.println("�ڳ��: "+baby);
}	

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
public boolean isMarry() {
	return marry;
}
public void setMarry(boolean marry) {
	this.marry = marry;
}
public int getBaby() {
	return baby;
}
public void setBaby(int baby) {
	this.baby = baby;
}
 
 
 
}
