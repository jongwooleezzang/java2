package exam123p;
//operator 같이 +,-,*,/ 인 경우에 사칙 연산을 수행하는 프로그램을 if ~else if문 과
//switch~case~ 문을 사용해 작성해보시오
public class Exam1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result =0;
		
		switch(operator) {
			case '+' :
				result = num1 +num2;
				break;
			case '-' :
				result = num1 -num2;
				break;
			case '/' :
				result = num1 /num2;
				break;
			default:
				System.out.println("연산오류");
		}
	}

}
