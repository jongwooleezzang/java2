package exam123p;
//Q2 구구단을 짝수단만 출력되도록만드세요. 2단 4단 6단 8단
public class Exam2 {
	public static void main(String[] args) {
		for(int i=2 ;i<10 ;i+=2) {
			System.out.println(i+"단");
			for(int j=1 ; j<10 ;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
//Q3 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어보세요		
		for(int i=2 ;i<10 ;i++) {
			System.out.println(i+"단");
			for(int j=1 ; j<=i ;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
//if 문 사용 	
		for(int i=2 ;i<10 ;i++) {
			System.out.println(i+"단");
			for(int j=1 ; j<10 ;j++) {
				if(i<j)continue; {
					System.out.println(i+"*"+j+"="+i*j);
					
				}
			}
		}
		
		
	}
}
