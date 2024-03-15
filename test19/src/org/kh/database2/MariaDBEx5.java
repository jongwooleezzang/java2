package org.kh.database2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MariaDBEx5 {

	public static void main(String[] args) {
		
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(ON/OFF) 하고, SQL 문장 실행
		ResultSet rs = null;	//검색(Select문)의 결과를 반환받음
		MariaDB maria = new MariaDB();
		String sql = "select * from student";
		con = maria.connect();
		pstmt = con.prepareStatement(sql);
		
		
	}

}
