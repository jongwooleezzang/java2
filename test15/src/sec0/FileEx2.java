package sec0;

import java.io.File;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		//파일의 상대 경로 지정
		File f1 = new File("a.txt");  //현재 디렉토리에 파일이 있든 없든 파일 객체가 생성
		File f2 = new File("../sec1/a.txt");  //현재 디렉토리에 는 sec0 인데 상위 디렉토리로 sec1 이동하여  에 있는 a.txt를 가져와라 
		File f3 = new File("d."+File.pathSeparator+"leejongwoo"+File.pathSeparator+"java2"+File.pathSeparator+"a.txt");  
		String path= "d:\\leejongwoo\\java2\\";
				
	}
}
