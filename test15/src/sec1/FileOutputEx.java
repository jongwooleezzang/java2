package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream : 파일의 내용을 바이트 단위로 쓰기 위한 클래스
public class FileOutputEx {
	public static void main(String[] args) throws IOException {
		File f1 = new File("b.txt");
	    if(f1.createNewFile()) {
	    	System.out.println("파일생성성공");
	    }else {
	    	System.out.println("이미 파일이 존재합니다.");
	    }
	    
	    FileOutputStream fos = new FileOutputStream(f1);
	    String data = "Hello java";
	    fos.write(data.getBytes());//getBtye()는 String을 byte 단위의 배열로 변경
	    fos.close();
	    
	}

}
