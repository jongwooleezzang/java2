package sec1;
//NumberFormatException : �������°� �ƴҰ�� �߻��ϴ� ����
public class ExceptionEx4 {

	public static void main(String[] args) {
		String data1 ="1004";
		String data2 ="kim1004";
		try {	
		 int val1 = Integer.parseInt(data1);
		 int val2 = Integer.parseInt(data2); //���� ������ ��ȯ�� �� ���� ���ڿ�
		 System.out.println(val1);
		 System.out.println(val2);
		 System.out.println(val1+20);
	    }catch(NumberFormatException e) {
		 System.out.println("������������ ó���Ҽ� ���� ������");
		 e.printStackTrace();
	    }catch(Exception e) {
	    	System.out.println("��ü�� �˼� ���� ����");
	    	e.getMessage(); 
	   	}finally {
	   		System.out.println("�۾�����");
	   	}
	   	
	}
}
 

