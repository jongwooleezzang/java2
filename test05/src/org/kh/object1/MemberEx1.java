package org.kh.object1;

public class MemberEx1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("kim");//mem1.id = "kim";
		mem1.setPw("1234");//mem1.pw = "1234";
		mem1.setEmail("whddn1310@naver.com");//mem1.email = "whddn1310@naver.com";
		mem1.setBirth(19941213);///mem1.birth = 1994;
		mem1.setTel("010-8784-8137");//mem1.tel = "01087848137";
		System.out.println(mem1.toString());
		
		
		
	}
}
