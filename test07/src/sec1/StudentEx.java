package sec1;

import java.util.Scanner;

public class StudentEx {
	Student[] s = new Student[5]; //5명의 학생(Student) 배열 객체 선언
	Scanner scn = new Scanner(System.in);
	for(int i=0; i<5; i++) {
		s[i] = new Student(); //개별객체생성
		s[i].setNo(i+1);
		System.out.println((i+1)+"번째국어 : ");
		s[i].setKor(scn.nextInt());
	}
}