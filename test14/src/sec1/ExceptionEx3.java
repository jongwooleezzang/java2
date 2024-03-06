package sec1;
//ArrayIndexOutOfBoundsException
public class ExceptionEx3 {

	public static void main(String[] args) {
		int[] nArr = {90,85,100};
		int i =0;
		while(i<=3) {
			try {
			System.out.println(nArr[i]);
			i++;
			}catch(ArrayIndexOutOfBoundsException e) {
				e.getMessage();
				break;
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("작업종료"); //성공수행(try)이든 실패수행(catch) 이든 반드시 시행하는것
			}
		}
	}

}
