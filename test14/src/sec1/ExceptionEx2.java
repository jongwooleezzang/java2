package sec1;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		String name =null;
		//실제 처리할 문장(try)이 예외가 발생하면, 예외처리 문장을 실행한다
		//다중 캐치 문장
		try {
			System.out.println(name.toString());
			System.out.println("정상처리 문장 아래");
		} catch(NullPointerException e) {
			e.printStackTrace();
			name = "김기태";
			System.out.println(name+"\n예외처리 문장아래");
		} catch(Exception e) {
			System.out.println("정체를 알수 없는 예외 발생");
		}
	}

}



