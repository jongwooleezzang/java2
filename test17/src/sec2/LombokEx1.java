package sec2;

public class LombokEx1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("whddn1310");
		mem1.setPw("as748596");
		mem1.setPoint(100);
		System.out.println(mem1.toString());
		
		Board bor1 = new Board();
		bor1.setBno(1);
		bor1.setTitle("자바어려워");
		bor1.setViewCnt(100);
	}
}
