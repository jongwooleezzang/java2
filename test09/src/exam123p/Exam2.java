package exam123p;
//Q2 �������� ¦���ܸ� ��µǵ��ϸ��弼��. 2�� 4�� 6�� 8��
public class Exam2 {
	public static void main(String[] args) {
		for(int i=2 ;i<10 ;i+=2) {
			System.out.println(i+"��");
			for(int j=1 ; j<10 ;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
//Q3 �������� �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ����ϴ� ���α׷��� ��������		
		for(int i=2 ;i<10 ;i++) {
			System.out.println(i+"��");
			for(int j=1 ; j<=i ;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
//if �� ��� 	
		for(int i=2 ;i<10 ;i++) {
			System.out.println(i+"��");
			for(int j=1 ; j<10 ;j++) {
				if(i<j)continue; {
					System.out.println(i+"*"+j+"="+i*j);
					
				}
			}
		}
		
		
	}
}
