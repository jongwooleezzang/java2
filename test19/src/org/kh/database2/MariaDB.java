package org.kh.database2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MariaDB {

	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(ON/OFF) 하고, SQL 문장 실행
		ResultSet rs = null;	//검색(Select문)의 결과를 반환받음
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		
		public Connection connect() {
			
			
			
			}
		
	}

}
