package sec2;

public class Database_Interface {

	����Ÿ ���̽�(Database) �������̽�
    connet(String url,	String port, String id, String pw)
    close(Connection conn,PreparedStatment pstmt, ResultSet rs)
	select(String tbname, String condition)
	insert(String bname, String field1, int value1, String condition)
	update(String tbname, String field1, int value1, String condition)
	delete(String tbname, String condition)

	Oracle Ŭ����(Database ���)
	String url
	int port
	String id;
	String pw;
	connet(String url,String port, String id, String pw)
			�Ű������� �Էµ� url, port , id, pw �� �����Ͽ� ����Ŭ �����ͺ��̽��� ����
	close(Connection conn, PreparedStatement pstmt, ResultSet rs)
			����� ����Ŭ �����ͺ��̽� ������ �����մϴ�.
	select(String tbname, String condition)
			select * from tbname condition ���
	insert(String tbname, String field1, int field2)
			insert into tbname values (field2, field2)���
	update(String tbname, String field1, int value1, String condition)
			update tbname set field1=value1 condition ���
	delete(String tbname, String condition)
			delete from tbname condition ���
	
	
	
}
