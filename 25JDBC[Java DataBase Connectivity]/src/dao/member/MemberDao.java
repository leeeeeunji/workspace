package dao.member;

import java.sql.*;
import java.util.*;
import java.util.Date;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	public MemberDao() {

	}

	public int insert(Member newMember) throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper10";
		String password="jdeveloper10";
		/****************************************************/
		
		String insertSQL = "insert into member values('"
							+ newMember.getM_id() + "','"
							+ newMember.getM_password() + "','"
							+ newMember.getM_name() + "','"
							+ newMember.getM_address() + "',"
							+ newMember.getM_age() + ",'"
							+ newMember.getM_married() + "',"
							+ newMember.getM_regdate() + ")";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL); //빠른 반환을 위해 사용하는 executeUpdate
		
		System.out.println(">>insert row count : " + rowCount + " 행 insert");
		stmt.close();
		con.close();
		return rowCount;
	}

	public int update(Member newMember) throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper10";
		String password="jdeveloper10";
		/****************************************************/
		
		String updateSQL = "update member set \r\n"
				+ "    m_password='" + newMember.getM_password() + "',\r\n"
				+ "    m_name='" + newMember.getM_name() + "',\r\n"
				+ "    m_address='" + newMember.getM_address() + "',\r\n"
				+ "    m_age=" + newMember.getM_age() + ",\r\n"
				+ "    m_married='" + newMember.getM_married() + "',\r\n"
				+ "    m_regdate=" + newMember.getM_regdate() + "\r\n"
				+ "where m_id='" + newMember.getM_id() + "'";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSQL);
		System.out.println(">>update row count " + rowCount + " 행 update");
		
		stmt.close();
		con.close();
		return rowCount;
	}

	public int delete(String m_id) throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper10";
		String password="jdeveloper10";
		/****************************************************/
		
		String deleteSQL = "delete from member where m_id='" + m_id + "'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSQL);
		System.out.println(">>delete row count " + rowCount + " 행 delete");
		
		stmt.close();
		con.close();
		return rowCount;
	}

	public Member findByPrimaryKey(String m_id) throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper10";
		String password="jdeveloper10";
		/****************************************************/
		
		String selectSQL = "select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate "
							+ "from member where m_id='" + m_id + "'";
		
		Member selectById = null;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSQL);
		
		if(rs.next()) {
			String id = rs.getString("m_id");
			String pw = rs.getString("m_password");
			String name = rs.getString("m_name");
			String address = rs.getString("m_address");
			int age = rs.getInt("m_age");
			char married = "m_marreid".charAt(0);
			Date regdate = rs.getDate("m_regdate");
			selectById = new Member(m_id, pw, name, address, age, married, regdate);
		}else {
			System.out.println("조건에 만족하는 회원 없음");
		}
		rs.close();
		stmt.close();
		con.close();
		return selectById;
	}

	public List<Member> findAll() throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper10";
		String password="jdeveloper10";
		/****************************************************/
		
		String selectSQL = "select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member";
		
		List<Member> memberList = new ArrayList<Member>();
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectSQL);
		
		if(rs.next()) {
			String id = rs.getString("m_id");
			String pw = rs.getString("m_password");
			String name = rs.getString("m_name");
			String address = rs.getString("m_address");
			int age = rs.getInt("m_age");
			char married = "m_marreid".charAt(0);
			Date regdate = rs.getDate("m_regdate");
			Member member = new Member(id, pw, name, address, age, married, regdate);
		}else {
			System.out.println("조건에 만족하는 회원목록 없음");
		}
		
		rs.close();
		stmt.close();
		con.close();
		return memberList;
		
	}
}
