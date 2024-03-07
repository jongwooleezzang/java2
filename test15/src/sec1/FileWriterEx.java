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
		fw.write("킹왕짱 햄스터");
		fw.newLine();
		fw.write("코딩의 삽고수 이종우");
		fw.newLine();
		fw.write("코딩의 신 이정기");
		fw.flush();
		fw.close();
	}

}
