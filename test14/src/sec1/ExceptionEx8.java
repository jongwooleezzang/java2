package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionEx8 {

	public static void main(String[] args) {
			FileInputStream fis =null; //���� �Է� ������ ������
			FileOutputStream ois =null;//���� ��� ������ �����Ҷ�
			
			try {
				fis = new FileInputStream("indata.txt");
				ois = new FileOutputStream("Outdata.txt");
			} catch (FileNotFoundException e) {
				System.out.println("������ ã���� �����ϴ�.");
				e.printStackTrace();
			} catch(Exception e) {
				System.out.println("���κҸ�");
				e.printStackTrace();
			} finally {
				System.out.println("���� ó�� ����");
			}
			
		}
	

}
