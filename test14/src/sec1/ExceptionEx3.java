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
				System.out.println("�۾�����"); //��������(try)�̵� ���м���(catch) �̵� �ݵ�� �����ϴ°�
			}
		}
	}

}
