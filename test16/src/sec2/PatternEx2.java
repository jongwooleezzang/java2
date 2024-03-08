package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx2 {

	public static void main(String[] args) {
			String[] email= {"kkt@02101", "whddn1310@naver.com", "whddn1310@daum.net"};
			Pattern p1 = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$"); // 이메일 패턴
			for (int i = 0; i < email.length; i++) {
			Matcher m = p1.matcher(email[i]);
				if (m.matches()) {
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
				}
			}

			
			String[] phone = {"010-1234123","010-8784-8137","010-1234-1343","010-121-123","010-222589-245",};
			Pattern p2 = Pattern.compile("010+-[0-9]{4}+-[0-9]{4}"); // 휴대폰 번호패턴 ("010-\d{4}-\\d{4}")로도 쓸수있다
			for (int i = 0; i < phone.length; i++) {
			Matcher m = p2.matcher(phone[i]);
				if (m.matches()) {
				System.out.println("핸드폰 번호의 타입이 맞습니다.");
				System.out.println(phone[i]);
				}
			}
			
			
			String[] jm = {"999112-1233311","941213-1018325","945512-1587468","940802-2045128","690710-1398931",};
			Pattern p3 = Pattern.compile("([0-9]{2})(0[1-9]||1[0-2])(0[1-9]||[1-2][0-9]||3[0-1])-[1-4]\\d{6}");
			for (int i = 0; i < jm.length; i++) {
			Matcher m = p3.matcher(jm[i]);
				if (m.matches()) {
				System.out.println("주민등록 번호의 타입이 맞습니다.");
				System.out.println(jm[i]);
				}
			}
			//비밀번호 패턴 : 4~10글자로 영문 대/소문자와 특수문자 (!@#$%&?*_) 그리고 숫자를 모두 최소 1문를포함
			//()반드시 포함
			//=. 이상
			//* 뒤에나오는 조건으로
			//(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&?*_]).{4,10}$
			String[] pw = {"abcd1234","A123a","1234","ABCD!123456","Abc!432",};
			Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&?*_]).{4,10}$");
			for (int i = 0; i < pw.length; i++) {
			Matcher m = p5.matcher(pw[i]);
				if (m.matches()) {
				System.out.println("영문 대문자, 소문자,특수문자,숫자가 모두 포함된 맞는 비밀번호입니다.");
				System.out.println(pw[i]);
				}
			
			
			
	       }
	}
	
}
	

