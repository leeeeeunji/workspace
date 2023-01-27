package dao.guest;

import java.sql.*;
import java.util.*;

import dao.address.*;
import dao.common.*;
import dao.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	private DataSource dataSource;
	
	public GuestDao() throws Exception {
		dataSource = new DataSource();
		
	}
/*
public int insert() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_INSERT);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;

	}
	
	public int update() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_UPDATE);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
	public int delete() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_DELETE);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public Guest findByPrimaryKey(int no) throws Exception {
		Guest guest = null;
		Connection con =  dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECT_BY_NO);
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			guest = new Guest(rs.getInt("guest_no"),
								rs.getString("guest_name"),
								rs.getDate("guest_date"),
								rs.getString("guest_email"),
								rs.getString("guest_homepage"),
								rs.getString("guest_title"),
								rs.getString("guest_content"));
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return guest;
	
	}
	
	
	public List<Guest> findAll() throws Exception {
		List<Guest> guestList = new ArrayList<Guest>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			do {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("address");
				Address address = new Address(no, name, phone, addr);
				//=addressList.add(address);
			}while(rs.next());
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return guestList;
	}
	
*/
}
