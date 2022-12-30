package dao.emp;

import java.sql.*;
import java.util.*;

import dao.common.*;

public class EmpDao {
	private DataSource dataSource;
	
	public EmpDao() throws Exception {
		dataSource = new DataSource();
	}
	/*
	 * join연산 결과는 map으로 매핑한다
	 */
	public Map findByPrimaryKeywithDept(int empno) throws Exception {
		Map rowMap = new HashMap();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.SELECT_BY_EMPNO_EMP_DEPT);
		pstmt.setInt(1, empno);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			/**emp**/
			int eno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			
			/**dept**/
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			rowMap.put("EMPNO", eno);
			rowMap.put("ENAME", ename);
			rowMap.put("JOB", job);
			rowMap.put("DNAME", dname);
			rowMap.put("LOC", loc);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return rowMap;
	}
	public List<Map> findAllWithDept() throws Exception {
		List<Map> rowMapList = new ArrayList<Map>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.SELECT_ALL_EMP_DEPT);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Map rowMap = new HashMap();
			/**emp**/
			int eno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			
			/**dept**/
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			rowMap.put("EMPNO", eno);
			rowMap.put("ENAME", ename);
			rowMap.put("JOB", job);
			rowMap.put("DNAME", dname);
			rowMap.put("LOC", loc);
			
			rowMapList.add(rowMap);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return rowMapList;
	}
}
