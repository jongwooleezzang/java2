package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date1 = new Date();
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1981,1,25,7,24,37);//년 ,월 ,일 ,시 ,분 ,초
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Mon,02 Apr 2001 03:48:27 +0900"); //0900은 타임존을 의미:RFC 822규격
		//지역이름(Global/Local) : KST , RFC 822: +0900
		//국가 코드: KR , 언어코드 : KO => KO_KR
		
		
		System.out.println(date1);
		System.out.println(date2); //날짜가 이상하게 출력된다  0부터 1월  11이 12월  ex) 0(1월)  2 3 4 5 6 7 8 9 10 11(12월)
		System.out.println(date3);
	
		 System.out.println("=======LocalDate=======");
		 
		 LocalDate now1 = LocalDate.now();
		 System.out.println(now1); //날짜 데이터
		 //날짜 데이터 => 문자열 데이터
		 String now2 = now1.toString();
		 System.out.println(now2); //날짜 데이터

		 //문자열 데이터 => 날짜데이터
		 LocalDate now3 =LocalDate.parse(now2);
		 System.out.println(now3);
		 
	}
}
