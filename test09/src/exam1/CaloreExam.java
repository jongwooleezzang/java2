package exam1;

import java.util.Scanner;

/*
Q1. Į�θ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	�Ʒ��� ���û��״�� �ܹ���, ź��ȭ��, ������ ���� Ű����� �Է¹޾� Į�θ�
	�� ����Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
	�ش� ��Ű�� : exam01
	���� Ŭ������(main �Լ� ����) : CalorieExam
	������ : Į�θ�(calorie), �ܹ���(protein), ź��ȭ��(carbohydrate), ����(fat)
	���� : Į�θ� = �ܹ���x4+ź��ȭ��x4+����x9
 */
public class CaloreExam {
	public static void main(String[] args) {
		 int calorie;
		 int protein;
		 int carbohydrate;
		 int fat;

		 Scanner sc = new Scanner(System.in);
		 System.out.println("�ܹ��� :");
		 protein =sc.nextInt();
		 System.out.println("ź��ȭ�� :");
		 carbohydrate =sc.nextInt();
		 System.out.println("����:");
		 fat =sc.nextInt();
		 calorie = (protein*4)+(carbohydrate*4)+(fat*9);
		 System.out.println("Į�θ�:"+calorie);
	}
}
