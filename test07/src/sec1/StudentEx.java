package sec1;

import java.util.Scanner;

public class StudentEx {
	Student[] s = new Student[5]; //5���� �л�(Student) �迭 ��ü ����
	Scanner scn = new Scanner(System.in);
	for(int i=0; i<5; i++) {
		s[i] = new Student(); //������ü����
		s[i].setNo(i+1);
		System.out.println((i+1)+"��°���� : ");
		s[i].setKor(scn.nextInt());
	}
}