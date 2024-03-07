package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyEX {

	public static void main(String[] args) {
		FileInputStream fis =null;
		//finally : 예외사항이 try 되어 성공 수행을 하게되든 exception 되어 실패 수행을 하던 반드시 처리해야하는문자
		try {
			fis = new FileInputStream("a.txt");
					
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}finally {
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("성공이든 실패든 항상 수행");
		}
		try {
			ois = new FileInputStream("a.txt");
		catch{
			
		 }
		}
		System.out.println("예외처리의 다음문장");
	}

}
