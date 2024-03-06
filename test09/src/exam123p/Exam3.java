package exam123p;

public class Exam3 {
/*
   *   
  ***  
 ***** 
*******
를 만드시오 (for 중첩문을 활용)
*/
	
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for (int j=4-i; j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
/*
   *   
  ***  
 ***** 
*******
 *****
  ***
   *
를 만드시오 (for 중첩문과 if 조건문 활용)
*/
			for(int i=1; i<=4; i++) {
				for (int j=4-i; j>0;j--) {
					System.out.print(" ");
				}
				for(int j=1; j<=2*i-1;j++) {
					System.out.print("*");
				}
				System.out.println();
				
				
				
				for(int i=5; i<=7; i++) {
					for (int j=1; j<=i-4;j++) {
						System.out.print(" ");
					}
				
			}
	}
}

