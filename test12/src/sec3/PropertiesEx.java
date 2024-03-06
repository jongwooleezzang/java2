package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx {//비중없음

	public static void main(String[] args) {
		//Properties 선언 및 생성
		Properties pro = new Properties();
		
		pro.setProperty("job", "developer"); //entry 라 안하고 element라고함 "job" element
		pro.setProperty("name", "김기태");
		pro.setProperty("age", "43");
		pro.setProperty("local", "가산동");
		
		System.out.println(pro);
		System.out.println("element의 수 : "+pro.size());
		System.out.println("개별접근 name :"+pro.getProperty("name"));
		
		//Properties의 순회 =>열거형으로 해당 엘리먼트의 키(속성)을 가져와 처리하여야함
		Enumeration e  =  pro.propertyNames();
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el+":"+pro.getProperty(el));
			
					
		}
	}

}
