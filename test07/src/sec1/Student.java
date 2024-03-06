package sec1;
// 필드: 번호 ,국어,영어,수학
// 메소드:getter/setter 및 총점, 평균,학점 모든 학생 정보 출력
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
		System.out.println("학점: "+grade);
   }
	
	public int tot() {
		return kor+eng+mat;
	}
	double avg() {
		return (kor+eng+mat)/3.0f;
	}
	void resulting() {
		System.out.println("모든학생정보");
		System.out.println("번호 :" +this.no+"\n총점 :" +this.tot() +"\n평균 :"+avg()+"\n국어 :"+kor
		+"\n수학 :"+mat+"\n영어 :"+eng);
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
