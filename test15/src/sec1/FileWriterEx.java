package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		BufferedWriter fw =new BufferedWriter(new FileWriter(file,true));
		fw.write("ŷ��¯ �ܽ���");
		fw.newLine();
		fw.write("�ڵ��� ���� ������");
		fw.newLine();
		fw.write("�ڵ��� �� ������");
		fw.flush();
		fw.close();
	}

}
