package sec1;
//NumberFormatException : 숫자형태가 아닐경우 발생하는 예외
public class ExceptionEx4 {

	public static void main(String[] args) {
		String data1 ="1004";
		String data2 ="kim1004";
		try {	
		 int val1 = Integer.parseInt(data1);
		 int val2 = Integer.parseInt(data2); //숫자 정수로 변환할 수 없는 문자열
		 System.out.println(val1);
		 System.out.println(val2);
		 System.out.println(val1+20);
	    }catch(NumberFormatException e) {
		 System.out.println("숫자형식으로 처리할수 없는 데이터");
		 e.printStackTrace();
	    }catch(Exception e) {
	    	System.out.println("정체를 알수 없는 예외");
	    	e.getMessage(); 
	   	}finally {
	   		System.out.println("작업종료");
	   	}
	   	
	}
}
 

