package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		
		for(int i=1; i<10;i++) {
			Member mem = new Member(i,"kim"+i,"abcd"+i,"��"+i);
			memList.add(mem);
		}
		Member mem2 = new Member(11,"Kang","abcd1004","�̼���");
				memList.add(mem2);
		
		for(Member m:memList) {//list��ȸ1 (����for��)
			System.out.println(m.toString());
		}
		for(int i=0 ;i<memlist.size();i++) {
			
		}
	}

}
