package edu.kh.test1;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		Member m1 = new Member();
		
		m1.setName("홍길동");
		m1.setAge(25);  //=> int 는 쌍따옴표 와 글자가 들어갈수없음
		m1.setAddress("서울시 영등포구");
		m1.setHobby("독서");
		
		Member m2 = new Member();
		
		m2.setName("김미영");
		m2.setAge(20); //=> 위와동일
	    m2.setAddress("서울시 금천구");
	    m2.setHobby("운동");
	    
	    List<Member> list = new ArrayList<Member>();
	    
	    list.add(m1);
	    list.add(m2);
	    
		for(Member mem : list) {//이건 그냥왜워야되는건가 // for(int i = 0; i < list.size(); i++)// Member mem = list.get(i);
            System.out.println("이름 :" + mem.getName());
			System.out.println("이름 :"+mem.getName());  //=>.getName 게터사용
			System.out.println("나이 :"+mem.getAge());
			System.out.println("주소 :"+mem.getAddress());
			System.out.println("취소 :"+mem.getHobby());
		}
	
	}

}
