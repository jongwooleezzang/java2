package sec1;

public class Student {// extends Object ������ ���µǾ� ���� . �׷��Ƿ� ��� Ŭ���� Object�� ����Ŭ������ ��´�
	private int sno;
	String name;
	public Student() {}
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	
	//��ü �����ÿ��� �ݵ�� clone()�� �������̵� �ؾ���.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student(); //�ش� ��ü ����
		clone.name = this.name;			//���� ������ ��ü�� ��� �ʵ� ���� �ѱ��
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
