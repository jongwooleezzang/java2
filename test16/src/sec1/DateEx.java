package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date1 = new Date();
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1981,1,25,7,24,37);//�� ,�� ,�� ,�� ,�� ,��
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Mon,02 Apr 2001 03:48:27 +0900"); //0900�� Ÿ������ �ǹ�:RFC 822�԰�
		//�����̸�(Global/Local) : KST , RFC 822: +0900
		//���� �ڵ�: KR , ����ڵ� : KO => KO_KR
		
		
		System.out.println(date1);
		System.out.println(date2); //��¥�� �̻��ϰ� ��µȴ�  0���� 1��  11�� 12��  ex) 0(1��)  2 3 4 5 6 7 8 9 10 11(12��)
		System.out.println(date3);
	
		 System.out.println("=======LocalDate=======");
		 
		 LocalDate now1 = LocalDate.now();
		 System.out.println(now1); //��¥ ������
		 //��¥ ������ => ���ڿ� ������
		 String now2 = now1.toString();
		 System.out.println(now2); //��¥ ������

		 //���ڿ� ������ => ��¥������
		 LocalDate now3 =LocalDate.parse(now2);
		 System.out.println(now3);
		 
	}
}
