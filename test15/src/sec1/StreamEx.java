package sec1;
//파일 /키보드/데이터입력:FileInputStream, BufferedInputStream, FileReader, BufferedRearder
//파일/모니터/데이터출력:FileOutputStream, BufferedOutpuStream, FileWriter, BufferedWriter
//Stream으로 끝나는 클래스는 데이터 입출력을 byte단위로 한다 :FileOutputStream, BufferedOutpuStream ,FileinputStream, BufferedInputStream
//Stream으로 끝나지 않는 클래스는 데이터 입출력을 문자 단위로 한다: FileReader, BufferedRearder, FileWriter, BufferedWriter
public class StreamEx {
	public static void main(String[] args) {
		String fileInptString ="FileInputStream는 바이트 단위로 입력하기 위한 스트림 ";
		String bufferedInputString ="BufferedInputStream 바이트 단위로 입력하기 위한 스트림: 메모리 버퍼로 로딩후";
		String fileReader ="FileReader는 문자 단위로 입력하기 위한 스트림 ";
		String bufferedReader ="BufferedRearder는 문자단위로 입력하기 위한 스트림 :메모리 버퍼로 로딩후 ";
		String fileOutputStream ="FileOutputStream는 바이트 단위로 출력하기 위한 스트림 ";
		String fileWriter ="FileWriter는 문자 단위로 출력하기 위한 스트림 ";
		String bufferedWriter ="BufferedWriter는 문자 단위로 출력하기 위한 스트림: 메모리 버퍼로 로딩후 ";
		System.out.println(fileInptString);
		System.out.println(bufferedInputString);
		System.out.println(fileReader);
		System.out.println(bufferedReader);
		System.out.println(fileOutputStream);
		System.out.println(fileWriter);
		System.out.println(bufferedWriter);
		
		
		
	}

}
