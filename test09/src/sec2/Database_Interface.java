package sec2;

public class Database_Interface {

	데이타 베이스(Database) 인터페이스
    connet(String url,	String port, String id, String pw)
    close(Connection conn,PreparedStatment pstmt, ResultSet rs)
	select(String tbname, String condition)
	insert(String bname, String field1, int value1, String condition)
	update(String tbname, String field1, int value1, String condition)
	delete(String tbname, String condition)

	Oracle 클래스(Database 상속)
	String url
	int port
	String id;
	String pw;
	connet(String url,String port, String id, String pw)
			매개변수로 입력된 url, port , id, pw 를 연결하여 오라클 데이터베이스에 연결
	close(Connection conn, PreparedStatement pstmt, ResultSet rs)
			연결된 오라클 데이터베이스 연결을 종료합니다.
	select(String tbname, String condition)
			select * from tbname condition 출력
	insert(String tbname, String field1, int field2)
			insert into tbname values (field2, field2)출력
	update(String tbname, String field1, int value1, String condition)
			update tbname set field1=value1 condition 출력
	delete(String tbname, String condition)
			delete from tbname condition 출력
	
	
	
}
