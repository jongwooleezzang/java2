package sec1;
class Student{
	private String name;
	private int age;
	
	public Student() {}
	
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
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}


public class GenericEx {

	public static void main(String[] args) {
		//생성자에 대한 제너릭의 타입 생략 가능 -자바 1.7이상 1.8부터
		Generic1<Student> s  = new Generic1<>();	
		Student a = new Student("장원영" , 21);
		s.setField1(a);
		
		Generic1<Teacher> t = new Generic1<>();
		Teacher b = new Teacher("김기태", 43);
		t.setField1(b);
		
		Generic1<Integer> i = new Generic1<>();
		i.setField1(1004);
		
		Generic1<String> str = new Generic1<>();
		str.setField1("김기태");
		
	}
}