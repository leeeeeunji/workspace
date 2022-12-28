package statement;

import java.sql.*;
import java.text.*;
import java.util.Date;

/*
<<PreparedStatement>>
	- PrepareStatement를 사용하면  sql 파싱이 한번만 이루어지므로 성능 향상이 된다.
	- PrepareStatement를 사용하면  sql을 작성할 때 편리하다

1. sql문 작성
    - ?(파라메타) 를 사용해서 나중에 외부에서 데이타(리터럴)를 받을 수 있게 한다.
      ex> insert into emp(empno,ename,job,manager,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)	
    - 테이블이름, 컬럼이름 등은 ? 를 사용해서 외부에서 입력 받을 수 없다.
      ex> select * from ? 
          select ?,? from emp    
2. PreparedStatement 객체 생성 후 인자로 sql문을 넣어서 생성한다
   ex> PreparedStatement pstmt = con.prepareStatement(sql);
3. 생성된 PreparedStatement 객체에 파라메타를 setting(binding) 한다
    - sql 좌측 ? 부터 1,2,3...
   ex> 	pstmt.setInt(1,1234);              
 	   	pstmt.setString(2,"KIM");              
   		pstmt.setString(3,"MANAGER");              
  		pstmt.setInt(4,7839);              
   		pstmt.setDate(5,new Date());              
   		pstmt.setDouble(6,1000.12);              
   		pstmt.setInt(7,0);              
   		pstmt.setInt(8,10);              
 4.  실행
    - 실행시 sql문을 인자로 넣지 않는다.
    ex> pstmt.executeUpdate();         
        pstmt.executeQuery();         
*/
public class PreparedStatementMain {

	public static void main(String[] args) throws Exception {
		/***************데이타베이스 접속 정보***************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		/****************************************************/
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		String deleteSql = "delete from emp where empno = ?";
		PreparedStatement pstmt1 = con.prepareStatement(deleteSql);
		
		/*
		 - PrepareStatement를 사용하면  sql 파싱이 한번만 이루어지므로 성능 향상이 된다.
		 */
		/*********************9001 delete********************/
		int empno = 9001;
		pstmt1.setInt(1,  empno);
		int rowCount = pstmt1.executeUpdate();
		System.out.println(rowCount + " 행이 delete");
		/*********************9002 delete********************/
		empno = 9002;
		pstmt1.setInt(1,  empno);
		rowCount = pstmt1.executeUpdate();
		System.out.println(rowCount + " 행이 delete");
		/*********************9003 delete********************/
		empno = 9003;
		pstmt1.setInt(1,  empno);
		rowCount = pstmt1.executeUpdate();
		System.out.println(rowCount + " 행이 delete");
		/*********************9004 delete********************/
		empno = 9004;
		pstmt1.setInt(1,  empno);
		rowCount = pstmt1.executeUpdate();
		System.out.println(rowCount + " 행이 delete");
		
		pstmt1.close();
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%insert%%%%%%%%%%%%%%%%%%%%");
		String insertSql = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt2 = con.prepareStatement(insertSql);
		
		/*********************9001 insert********************/
		empno = 9001;
		String ename ="JUNG";
		String job = "MANAGER";
		int mgr = 7369;
		Date hiredate = new Date();
		double sal = 3000.34;
		int comm = 30;
		int deptno = 40;
		
		pstmt2.setInt(1, empno);
		pstmt2.setString(2, ename);
		pstmt2.setString(3, job);
		pstmt2.setInt(4, mgr);
		pstmt2.setDate(5, new java.sql.Date(hiredate.getTime()));
		pstmt2.setDouble(6, sal);
		pstmt2.setInt(7, comm);
		pstmt2.setInt(8, deptno);
		
		rowCount = pstmt2.executeUpdate();
		System.out.println(">> PreparedStatement 9001 -> " + rowCount + " 행 insert");
		
		/*********************9002 insert********************/
		empno = 9002;
		ename ="HONG";
		job = "CLERK";
		mgr = 7369;
		hiredate = new SimpleDateFormat("yyyy/MM/dd").parse("2001/05/12");
		sal = 5000.56;
		comm = 0;
		deptno = 40;
		
		pstmt2.setInt(1, empno);
		pstmt2.setString(2, ename);
		pstmt2.setString(3, job);
		pstmt2.setInt(4, mgr);
		pstmt2.setDate(5, new java.sql.Date(hiredate.getTime()));
		pstmt2.setDouble(6, sal);
		pstmt2.setInt(7, comm);
		pstmt2.setInt(8, deptno);
		
		rowCount = pstmt2.executeUpdate();
		System.out.println(">> PreparedStatement 9002 -> " + rowCount + " 행 insert");
		pstmt2.close();
		
		/*********************9003 insert********************/
		empno = 9003;
		ename ="김수미";
		job = "SALESMAN";
		mgr = 7369;
		hiredate = new SimpleDateFormat("yyyy/MM/dd").parse("2022/12/25");
		sal = 5682.99;
		comm = 50;
		deptno = 40;
		
		String insertSql3 = "insert into emp values(?, ?, ?, ?,to_date(?, ?), ?, ?, ?)";
		PreparedStatement pstmt3 = con.prepareStatement(insertSql3);
		
		pstmt3.setInt(1, empno);
		pstmt3.setString(2, ename);
		pstmt3.setString(3, job);
		pstmt3.setInt(4, mgr);
		pstmt3.setString(5, "2000/12/31");
		pstmt3.setString(6, "YYYY/MM/DD");
		pstmt3.setDouble(7, sal);
		pstmt3.setInt(8, comm);
		pstmt3.setInt(9, deptno);
		
		rowCount = pstmt3.executeUpdate();
		System.out.println(">> PreparedStatement 9003 -> " + rowCount + " 행 insert");
		
		/*********************9004 insert********************/
		
		empno = 9004;
		//ename = null;
		//job = null;
		//mgr = null;
		//hiredate = null;
		//sal = null;
		//comm = null;
		//deptno = null;
		
		String insertSql4 = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt4 = con.prepareStatement(insertSql4);
		
		pstmt4.setInt(1, empno);
		pstmt4.setNull(2, Types.VARCHAR);
		pstmt4.setNull(3, Types.VARCHAR);
		pstmt4.setNull(4, Types.INTEGER);
		pstmt4.setNull(5, Types.DATE);
		pstmt4.setNull(6, Types.DOUBLE);
		pstmt4.setNull(7, Types.INTEGER);
		pstmt4.setNull(8, Types.INTEGER);
		
		rowCount = pstmt4.executeUpdate();
		System.out.println(">> PreparedStatement 9004 -> " + rowCount + " 행 insert");
		
		pstmt4.close();
		con.close();
		
	}

}
