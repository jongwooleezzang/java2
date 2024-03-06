package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEx3 {

	public static void main(String[] args) {
		List<Student> s =new ArrayList<Student>();
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<5;i++);{
			Student st = new Student(); //한명의 학생 객체
			st.setNo(i+1);  //번호 자동부여
			st.setKor();
		}
	}
}
