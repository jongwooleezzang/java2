package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : 특정 데이터가 형식이 맞는는 비교하려고 할 경우  데이터 형식을 지정하는 클래스 
//Matcher : 특정 패턴의 형태가 맞는지 비교하는 클래스 
//정규식(Reg Expression) => RegEx
public class PatternEx1 {
	public static void main(String[] args) {
		String[] dt = {"bag","kim1004","9 to 6","8 to 5","Single","Mom","ABC","김기태","^*^","123123"};
		//Pattern p = Pattern.compile("[a-z]*"); //영문 소문자로만 구성된데이터
		//Pattern p = Pattern.compile("S[A-Z a-z]*"); //s로 시작하면서 영문 대소문자로 구성된 데이터
		//Pattern p = Pattern.compile("[가-힣]*"); //s로 시작하면서 영문 대소문자로 구성된 데이터
		//Pattern p = Pattern.compile("[e]$*"); //특정 문자로 끝나는 경우$  안나옴
		//Pattern p = Pattern.compile("^b"); //특정 문자로 시작하는경우		안나옴
		  Pattern p = Pattern.compile("[0-9]*"); //모든값이 숫자인 데이터  ???????^차이가 머임???????????????
		for(int i=0 ; i<dt.length; i++) {
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("형식 일치 :"+dt[i]);
				
			}
		}
	}
}
