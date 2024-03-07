package sec3;
class PwFormatException extends Exception{
	public PwFormatException(String msg) {
		System.out.println("msg : "+msg);
		System.out.println("��ȣ�� ���� ����ġ");
		
	}
}
class Member{
	private String id;
	private String pw;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) throws PwFormatException{
		if(pw == null) {
			throw new PwFormatException("��ȣ�� ����ֽ��ϴ�");
		}else if (pw.length()<=8 || pw.length()>20) {
			throw new PwFormatException("���ڼ��� 8~20 �̾ƴմϴ�.");
		}
		this.pw = pw;
	}
}


public class UserExceptionEx2 {
	public static void main(String[] args) throws PwFormatException {
		Member mem1 = new Member();
		mem1.setId("admin");
		mem1.setPw("1234");
		
		mem1.setPw(null);
		
	}
	 
}
