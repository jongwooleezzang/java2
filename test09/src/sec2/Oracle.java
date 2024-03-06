package sec2;

public class Oracle implements Database{	
	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost";
	final static int PORT = 1521;
	final static String PID = "xe";
	final static String ID = "system";
	final static String PW = "1234";
	@Override
	public void connect(String url, String port, String id, String pw) {
		System.out.println(url+":"+port+":"+PID+"/"+id+";"+pw);
		System.out.println("Oracle �����ͺ��̽��� ���������� ����Ǿ����ϴ�.");
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