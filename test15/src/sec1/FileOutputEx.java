package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream : ������ ������ ����Ʈ ������ ���� ���� Ŭ����
public class FileOutputEx {
	public static void main(String[] args) throws IOException {
		File f1 = new File("b.txt");
	    if(f1.createNewFile()) {
	    	System.out.println("���ϻ�������");
	    }else {
	    	System.out.println("�̹� ������ �����մϴ�.");
	    }
	    
	    FileOutputStream fos = new FileOutputStream(f1);
	    String data = "Hello java";
	    fos.write(data.getBytes());//getBtye()�� String�� byte ������ �迭�� ����
	    fos.close();
	    
	}

}
