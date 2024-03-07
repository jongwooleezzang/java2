package sec0;
//존나중요!!
import java.io.File;
import java.io.IOException;

public class FileEx1 {

	public static void main(String[] args) throws IOException{
		String file1 = "d:\\leejongwoo\\java2\\a.txt";//경로저장 로컬경로(현재 컴퓨터)
		String file2 = "http://192.168.1.104/data/menual/java/.txt";//원격경로 url (웹의 경로)
		
		File f1 = new File(file1);
		
		String fileName = f1.getName();
		System.out.println(fileName); //경로출력 x 이름출력
		int pos = fileName.lastIndexOf(".");//첫번째 .의 위치를 찾는다 그래서 last를 붙인다
		System.out.println("확장자와 파일명의 구분을 나타내는 점의 위치 : "+pos);
		System.out.println("확장자를 제외한 파일의 이름 : "+fileName.substring(0,pos));
		System.out.println("확장자 : "+fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일의 이름(절대경로) : "+f1.getAbsolutePath());
		System.out.println("경로를 포함한 파일의 이름(상대경로) : "+f1.getPath());
		//db에는 파일 자체가 아닌 파일의 위치를 담는다. 
		System.out.println("파일이 속해있는 상위 디렉토리 : " +f1.getParent());
		System.out.println("경로 구분자 : " + File.separator	); //File.separatorChar 와동일
		
		//시스템 변수 출력 => System.getProperty("시스템 변수명")==========================================파일처리와는 관계없음
		System.out.println("현재 사용자 디렉토리 (user.dir) : " + System.getProperty("user.dir"));
		System.out.println("자바  디렉토리 (sun.boot.class.path) : " + System.getProperty("sun.boot.class.path"));
		System.out.println("운영체제(OS) 환경변수값 : " + System.getenv());
		System.out.println("JAVA_HOME : " +System.getenv("JAVA_HOME"));
		
		
		
		
	}
}
