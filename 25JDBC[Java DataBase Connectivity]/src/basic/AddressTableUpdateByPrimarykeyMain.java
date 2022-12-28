package basic;

import java.sql.*;

public class AddressTableUpdateByPrimarykeyMain {

	public static void main(String[] args) throws Exception {

		/***************데이타베이스 접속 정보***************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/****************************************************/
		
		String updateSQL = "update address set name='김경호', phone='899-9999', address='서울시 강남구' where no = 1";
		
		/*
		 * 1. Driver class loading
		 * 2. Connection 객체 생성
		 * 3. Statement 객체 생성
		 * 4. SQL문 전송(insert)
		 * 5. SQL문 전송(insert)결과 영향받은 행의 수 반환
		 * 6. 연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSQL);
		System.out.println(">> " + rowCount + " 행 update");
		
		stmt.close();
		con.close();
	}

}
