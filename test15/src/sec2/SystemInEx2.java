package sec2;

import java.io.IOException;

public class SystemInEx2 {

	public static void main(String[] args) throws IOException{
		System.out.println("���� �ܾ� �Ǵ� ������  �Է��ϰ�,[Enter]�� ��������");
		int i;
		String data ="";
		try {
			while((i= System.in.read()) != '\n'){//�ƽ�Ű�ڵ� �ѱ��� �Է� =>����Ʈ ���� �Է�
				System.out.println((char) i);
				data += (char) i;
			}
		}
		 catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("�Էµ� �ܾ� �Ǵ� ���� : "+data);
	}

}
