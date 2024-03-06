package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionEx8 {

	public static void main(String[] args) {
			FileInputStream fis =null; //파일 입력 내용을 읽을때
			FileOutputStream ois =null;//파일 출력 내용을 저장할때
			
			try {
				fis = new FileInputStream("indata.txt");
				ois = new FileOutputStream("Outdata.txt");
			} catch (FileNotFoundException e) {
				System.out.println("파일을 찾을수 없습니다.");
				e.printStackTrace();
			} catch(Exception e) {
				System.out.println("원인불명");
				e.printStackTrace();
			} finally {
				System.out.println("파일 처리 종료");
			}
			
		}
	

}
