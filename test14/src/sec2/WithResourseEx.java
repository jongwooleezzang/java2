package sec2;

class AutoResourse implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 자동으로 Close 되었습니다.");
	}
	
}

public class WithResourseEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
		 
	}

}
