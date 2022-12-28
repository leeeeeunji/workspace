package basic;

import java.sql.*;

public class AddressTableInsertMain {

	public static void main(String[] args) throws Exception {

		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String insertSQL = "insert into address values(address_no_seq.nextval,'김김김','123-4568','경기도 시흥시')";
		
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
		int rowCount = stmt.executeUpdate(insertSQL); //빠른 반환을 위해 사용하는 executeUpdate
		/*
		Statement 를 사용한 SQL문전송
		int executeUpdate(String sql) throws SQLException
			- Executes the given SQL statement, 
				which may be an INSERT, UPDATE, or DELETE statement 
				or an SQL statement that returns nothing, 
				such as an SQL DDL statement.
		Parameters:
			sql - an SQL Data Manipulation Language (DML) statement, 
				 such as INSERT, UPDATE or DELETE; 
				 or an SQL statement that returns nothing, 
				 such as a DDL statement.
		Returns:
			either (1) the row count for SQL Data Manipulation Language (DML) statements 
			or (2) 0 for SQL statements that return nothing
		 */
		
		
		System.out.println(">>insert row count : " + rowCount + " 행 insert");
		stmt.close();
		con.close();
		
		
		

	}

}
