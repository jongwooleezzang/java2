package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//����Ʈ ��Ʈ�� ������ ������ ������ �������� �� ��� Ȱ�� , ����Ʈ �����̹Ƿ� char ��  ����ȯ �Ͽ� �о�;� �ϸ�
//�����ڵ忡 �ش��ϴ� �ѱ��̳� �������� ���� �о� ���� ����.
public class FileInputStreamEx1 {//���� ���� reader �� input �� ���� ���� ������ ��ɾ�

	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");
	    //EOF(End OF File) => -1�� �ǹ���
		FileInputStream fis = new FileInputStream(f1);
		int i;
		while((i=fis.read()) != -1) {
			System.out.println((char) i);
		}
	}

	
}
