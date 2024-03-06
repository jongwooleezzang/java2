package sec3;

public class WrapperEx {

	public static void main(String[] args) {
		//	int a; //기본타입
		//	System.out.println("a=" +a); //값을 초기화 하지않아서 오류
		int a = 10;   //기본타입 선언
		Integer b =a; //참조형 타인 선언(참조형에 기본형데이터 대입 : Wrapping,Boxing)
		int c = b; //  기본형에 참조형 데이터 대입 UnWrap , UnBoxing
		/*Boxing :  기본형은 멤버를 가질수 없으므로 해당타입의 메소드나 필드가 없기떄문에
					참조형으로 변경하여야 여러 필요한 정보를 확인하고, 그 타입의 메소드를 사용할 수 있어야 하므로
					해당 타입의 관련 메소드를 사용하기 위해서는 기본형을 참조형으로 바꾸어야 한다.
					그러므로, 기본타입에 관련된 Boxing을 실시하여 참조형으로 변경할 수 있는 
					클래스를 Wrapper 클래스라고 한다
		*/
		//boolean <=> Boolean
		//byte    <=> Byte
		//char    <=> Character
		//short   <=> Short
		//int     <=> Integer
		//long    <=> Long
		//float   <=> Float 
		String d = "10";
		String e ="3.14";
		System.out.println("문자열 10을 Integer(정수) 타입의 10으로 변경 =>"+Integer.valueOf(10));
		System.out.println("문자열 3.14를 Double(실수) 타입의 3.14로 변경 => "+Double.valueOf(e));
	}

}
