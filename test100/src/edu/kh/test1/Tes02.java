package edu.kh.test1;

import java.util.Scanner;

public class Tes02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] memberArr = {"ȫ�浿","�輺��","������","������","������"};
		System.out.print("�˻��� ȸ�� �̸��� �Է��Ͻÿ� : ");
		String searhName =sc.next(); //=> Sc.nextInt =>.nextString ���ιٲ�
		
		boolean result = false;
		
		for(int i=0 ; i<=memberArr.length ; i++) {//1 => 0���ιٲ�
			if(memberArr[i].equals(searhName)) {
				result =true ;
				break;
			}else {
				result =false ;
				break;
			}
		}
		  if(result) {
			  System.out.println("ȸ���� �����մϴ�."); //=> ȸ���� �����մϴٷ� ����
		  }else {
			  System.out.println("ȸ���� ���������ʽ��ϴ�."); //=> ȸ���� �������� �ʽ��ϴٷ� ����
		  }
		
	}
}

	

	

	
