package sec0;

import java.io.File;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		//������ ��� ��� ����
		File f1 = new File("a.txt");  //���� ���丮�� ������ �ֵ� ���� ���� ��ü�� ����
		File f2 = new File("../sec1/a.txt");  //���� ���丮�� �� sec0 �ε� ���� ���丮�� sec1 �̵��Ͽ�  �� �ִ� a.txt�� �����Ͷ� 
		File f3 = new File("d."+File.pathSeparator+"leejongwoo"+File.pathSeparator+"java2"+File.pathSeparator+"a.txt");  
		String path= "d:\\leejongwoo\\java2\\";
				
	}
}
