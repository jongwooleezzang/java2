package sec1;

import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //Date today =new Date();
		int year =today.get(Calendar.YEAR);
		int month =today.get(Calendar.MONTH)+1;
		int day =today.get(Calendar.DATE);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		
		int hour12 =today.get(Calendar.HOUR);//12시간재
		int hour24 =today.get(Calendar.HOUR_OF_DAY);//24시간재
		int minute =today.get(Calendar.MINUTE); //분
		int second =today.get(Calendar.SECOND); //초
		int ampm =today.get(Calendar.AM_PM); //오전오후
		
		int timeZone =today.get(Calendar.ZONE_OFFSET); //밀리초 => 시간(/1000/60/60)
		int lastdate =today.getActualMaximum(Calendar.DATE);
		int firstdate =today.getActualMinimum(Calendar.DATE);
		
		
		
		System.out.println("현재 년도 :"+year);
		System.out.println("현재 월 :"+month);
		System.out.println("현재 일 :"+day);
		
		System.out.println("오늘은 현재년도 1월1일부터 "+doy+"일째");
		System.out.println("오늘은"+month+"월의"  +dom+"번째날");
		System.out.println("오늘은 이번주의 "+dow+"번째 날");
		
		String[] wk= {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.println("오늘은 "+wk[dow]+"입니다.");
		
		System.out.println("현재시간  : "+hour24+":"+minute+":"+second);
		if(ampm==0) {
			System.out.println("오전"+hour12+":"+minute+":"+second);
		}else {
			System.out.println("오후"+hour12+":"+minute+":"+second);
		}
		
		System.out.println("타임존 : " +(timeZone/1000/60/60));
		System.out.println("이달의 마지막날 : " +lastdate);
		System.out.println("이달의 첫번쨰날 : " +firstdate);
	}
}
