package sec0;

import java.io.File;
import java.io.IOException;

//파일 생성
public class FileEx4 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("a.txt"); 
		File file2 = new File("b.txt");
		
		if(file1.createNewFile()) {
			System.out.println("File1 Creaed Success");
		}else {
			System.out.println("File1 already exists");
		}
		
		if(file2.createNewFile()) {
			System.out.println("File2 Creaed Success");
		}else {
			System.out.println("File2 already exists");
		}
	}
}
