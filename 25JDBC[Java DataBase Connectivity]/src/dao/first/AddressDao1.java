package dao.first;
/*
 * Dao(Date Access Object) 클래스
 * 		- address테이블에 CRUD(Create, Read, Update, Delete)작업을 하는 단위메소드를 
 * 		  가지고 있는 클래스
 */

import java.sql.*;

public class AddressDao1 {
	public AddressDao1() {
		
	}
	public void insert() throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/****************************************************/
		
		String insertSQL = "insert into address values(address_no_seq.nextval,'김김김','123-4568','경기도 시흥시')";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL); //빠른 반환을 위해 사용하는 executeUpdate
		
		System.out.println(">>insert row count : " + rowCount + " 행 insert");
		stmt.close();
		con.close();
	}
	public void update() throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/****************************************************/
		
		String updateSQL = "update address set name='김경호', phone='899-9999', address='서울시 강남구' where no = 1";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSQL);
		System.out.println(">> " + rowCount + " 행 update");
		
		stmt.close();
		con.close();
	}
	public void delete() throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/****************************************************/
		
		String deleteSQL = "delete address where no=23";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSQL);
		System.out.println(">> " + rowCount + " 행 delete");
		stmt.close();
		con.close();
	}
	public void findByPrimaryKey() throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/****************************************************/
		String selectSQL = "select no, name, phone, address from address where no = 3";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSQL);
		
		if(rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no + "\t" + name + "\t" + phone + "\t" + address);
		}else {
			System.out.println("조건에 만족하는 주소록 존재하지 않음");
		}
		
		rs.close();
		stmt.close();
		con.close();
	}//1개만
	public void findAll() throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/****************************************************/
		String selectSQL = "select no, name, phone, address from address";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSQL);
		
		if(rs.next()) {
			do {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				System.out.println(no + "\t" + name + "\t" + phone + "\t" + address);
			}while(rs.next());
		}else {
			System.out.println("조건에 만족하는 주소록 존재하지 않음");
		}
		
		rs.close();
		stmt.close();
		con.close();
	}//모두

}
