package exam123p;
//operator ���� +,-,*,/ �� ��쿡 ��Ģ ������ �����ϴ� ���α׷��� if ~else if�� ��
//switch~case~ ���� ����� �ۼ��غ��ÿ�
public class Exam1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result =0;
		
		switch(operator) {
			case '+' :
				result = num1 +num2;
				break;
			case '-' :
				result = num1 -num2;
				break;
			case '/' :
				result = num1 /num2;
				break;
			default:
				System.out.println("�������");
		}
	}

}
