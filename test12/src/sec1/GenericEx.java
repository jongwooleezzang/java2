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
		//�����ڿ� ���� ���ʸ��� Ÿ�� ���� ���� -�ڹ� 1.7�̻� 1.8����
		Generic1<Student> s  = new Generic1<>();	
		Student a = new Student("�����" , 21);
		s.setField1(a);
		
		Generic1<Teacher> t = new Generic1<>();
		Teacher b = new Teacher("�����", 43);
		t.setField1(b);
		
		Generic1<Integer> i = new Generic1<>();
		i.setField1(1004);
		
		Generic1<String> str = new Generic1<>();
		str.setField1("�����");
		
	}
}