package sec2;

import java.io.IOException;

public class SystemInEx {
	public static void main(String[] args) throws IOException{
		System.out.println("�����͸� �Է��ϰ�,[Enter]�� ��������");
		int i;
		try {
			i= System.in.read(); //�ƽ�Ű�ڵ� �ѱ��� �Է� =>����Ʈ ���� �Է�
			System.out.println(i);
			System.out.println("�Էµȹ���: "+((char)i));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
