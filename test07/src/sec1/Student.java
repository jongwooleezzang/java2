package sec1;
// �ʵ�: ��ȣ ,����,����,����
// �޼ҵ�:getter/setter �� ����, ���,���� ��� �л� ���� ���
public class Student {
	private int no;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private int evg;
	private String grade;
	
	
	
	void grade(int evg) {
		if(evg>=90)
		{
			grade = "A";
		}
		else if(evg>=80) {
			grade = "B";
		}
		else if(evg>=70) {
			grade = "C";
		}
		else if(evg>=60) {
			grade = "D";
	    }
		else  {
			grade = "F";
		}
		System.out.println("����: "+grade);
   }
	
	public int tot() {
		return kor+eng+mat;
	}
	double avg() {
		return (kor+eng+mat)/3.0f;
	}
	void resulting() {
		System.out.println("����л�����");
		System.out.println("��ȣ :" +this.no+"\n���� :" +this.tot() +"\n��� :"+avg()+"\n���� :"+kor
		+"\n���� :"+mat+"\n���� :"+eng);
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getEvg() {
		return evg;
	}
	public void setEvg(int evg) {
		this.evg = evg;
	}
	
	
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setNo(1);
		s1.setKor(90);
		s1.setEng(92);
		s1.setMat(94);
		s1.resulting();
		s1.grade();
		
		
		
	}
	
}
