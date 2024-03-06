package org.kh.object2;

import org.kh.object1.Member;

public class MemberEx2 {

	public static void main(String[] args) {

		Member mem1 = new Member();
		mem1.setId("kim");//mem1.id = "kim";
		mem1.setPw(null);//mem1.pw = "1234";
		mem1.setEmail(null);//mem1.email = "whddn1310@naver.com";
		mem1.setBirth(0);///mem1.birth = 1994;
		mem1.setTel(null);//mem1.tel = "01087848137";
		System.out.println(mem1.toString());
		
		
	}

	
}
