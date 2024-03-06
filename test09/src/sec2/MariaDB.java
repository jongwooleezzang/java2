package sec2;
//MariaDB ����ü
public class MariaDB implements Database {
	
	final static String DRIVER = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost";
	final static int PORT = 3308;
	final static String ID = "root";
	final static String PW = "1234";
	@Override
	public void connect(String url, String port, String id, String pw) {
		System.out.println(url+":"+port+"/"+id+";"+pw);
		System.out.println("MariaDB �����ͺ��̽��� ���������� ����Ǿ����ϴ�.");
	}
	@Override
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs!=null) {
			System.out.println("�����(�����) �ݱ�");
		}
		if(pstmt!=null) {
			System.out.println("�����ͺ��̽��� ��Ȱ��ȭ");
		}
		if(conn!=null) {
			System.out.println("�����ͺ��̽� ���� ����");
		}
	}
	@Override
	public void select(String tbname, String condition) {
		//select * from tbname condition ���
		System.out.println("select * from "+tbname+condition);
	}
	@Override
	public void insert(String tbname, String field1, int field2) {
		//insert into tbname values (field2, field1) ���
		System.out.println("insert into "+tbname+" values ("+field2+", "+field1+")");
		
	}
	@Override
	public void update(String tbname, String field1, int value1, String condition) {
		//update tbname set field1=value1 condition ���
		System.out.println("update "+tbname+" set "+field1+"="+value1+condition);
	}
	@Override
	public void delete(String tbname, String condition) {
		//delete from tbname condition ���
		System.out.println("delete from "+tbname+condition);
	}
}
