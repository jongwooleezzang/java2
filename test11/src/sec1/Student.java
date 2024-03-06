package sec1;

public class Student {// extends Object 구절이 생력되어 있음 . 그러므로 모든 클래는 Object를 시조클래스로 삼는다
	private int sno;
	String name;
	public Student() {}
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	
	//객체 복제시에는 반드시 clone()을 오버라이딩 해야함.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student(); //해당 객체 생성
		clone.name = this.name;			//새로 생성된 객체에 모든 필드 값을 넘기기
		clone.sno = this.sno;
		return clone;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};
	
}
