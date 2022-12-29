package connection;

import java.sql.*;

import dao.common.*;

public class AccountService {
	private DataSource dataSource;
	
	public AccountService() {
		dataSource = new DataSource();
	}
	
	/*
	 * 모든 계좌의 잔고를 balance만큼 갱신
	 */
	public void updateBalance(int balance) {
		boolean exceptionCondition = true;
		Connection con = null;
		PreparedStatement pstmt = null;
		String updateSql = "update accounta set acc_balance = acc_balance + ? where acc_no = ? ";
		
		try {
			con = dataSource.getConnection();
			System.out.println("----------------updateBalance transaction start-----------------");
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(updateSql);
			
			/**********************************1000번 계좌 update********************************/
			int acc_no = 1000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			int rowCount = pstmt.executeUpdate();
			System.out.println(acc_no + "번 계좌 update" + rowCount + "행 update");
			/**********************************2000번 계좌 update********************************/
			acc_no = 2000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no + "번 계좌 update" + rowCount + "행 update");
			/**********************************3000번 계좌 update********************************/
			acc_no = 3000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no + "번 계좌 update" + rowCount + "행 update");
			/**********************************4000번 계좌 update********************************/
			acc_no = 4000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no + "번 계좌 update" + rowCount + "행 update");
			
			/**예외발생**/
			int rn = (int)Math.random() * 2;
			if(rn%2==0) {
				exceptionCondition = true;
			}else {
				exceptionCondition = false;
			}
			
			if(exceptionCondition) {
				throw new Exception("모든계좌잔고갱신예외발생");
			}
			
			/**********************************5000번 계좌 update********************************/
			acc_no = 5000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no + "번 계좌 update" + rowCount + "행 update");
			/**********************************6000번 계좌 update********************************/
			acc_no = 6000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no + "번 계좌 update" + rowCount + "행 update");
			System.out.println("---------------updateBalance transaction end[commit]----------------");
			con.commit();
			
			
		}catch (Exception e) {
			System.err.println("예외발생");
			System.out.println("---------------updateBalance transaction end[commit]----------------");
			try {
				con.rollback();
			}catch (SQLException e1){
				e1.printStackTrace();
			}
			
		}finally {
			/*
			 * exception 발생 유무와 관계없이 항상 실행
			 * 	- 리소스해지
			 */
			try {
				dataSource.close(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
