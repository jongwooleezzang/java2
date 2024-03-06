package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		
		for(int i=1; i<10;i++) {
			Member mem = new Member(i,"kim"+i,"abcd"+i,"김"+i);
			memList.add(mem);
		}
		Member mem2 = new Member(11,"Kang","abcd1004","이성하");
				memList.add(mem2);
		
		for(Member m:memList) {//list순회1 (향상된for문)
			System.out.println(m.toString());
		}
		for(int i=0 ;i<memlist.size();i++) {
			
		}
	}

}
