package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyEX {

	public static void main(String[] args) {
		FileInputStream fis =null;
		//finally : ���ܻ����� try �Ǿ� ���� ������ �ϰԵǵ� exception �Ǿ� ���� ������ �ϴ� �ݵ�� ó���ؾ��ϴ¹���
		try {
			fis = new FileInputStream("a.txt");
					
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}finally {
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�����̵� ���е� �׻� ����");
		}
		try {
			ois = new FileInputStream("a.txt");
		catch{
			
		 }
		}
		System.out.println("����ó���� ��������");
	}

}
