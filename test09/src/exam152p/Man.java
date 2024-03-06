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
	System.out.println("나이: "+age);
	System.out.println("이름: "+name);
	System.out.print("성별: ");
	if(gender) {
		System.out.println("남성");
	} else {
		System.out.println("여성");
	}
	
	System.out.print("결혼여부: ");
	if(marry) {
		System.out.println("기혼");
	} else {
		System.out.println("미혼");
	}
	System.out.println("자녀수: "+baby);
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
