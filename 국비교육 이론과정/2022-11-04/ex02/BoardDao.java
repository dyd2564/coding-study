package sec01.ex02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDao {
//	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
//	private static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
//	private static final String USER ="scott";
//	private static final String PWD ="tiger";
	private DataSource dataSource;
	private Connection con; // 오라클에 연동하는데 필요한 객체
	private PreparedStatement pstmt; // 데이터베이스에 쿼리문 전달
	
	public BoardDao() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataSource = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (NamingException e) {
//			e.printStackTrace();
			System.out.println("여기맞니?");
		}
	}
	
	public List<BoardVO> listBoards() {
		List<BoardVO> list = new ArrayList<BoardVO>();
//		connDB();
		String query = "SELECT * FROM BOARD_TEL";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				// @param : 테이블 컬럼(열) 이름
				BoardVO vo = new BoardVO(
						rs.getString("bno"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("writter"),
						rs.getDate("regDate"),
						rs.getDate("updateDate"));
				list.add(vo); // 리스트에 추가
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
//	private void connDB() {
//		try {
//			Class.forName(DRIVER); // OracleDriver 객체 생성
//			// 커넥션 객체를 얻음
//			con = DriverManager.getConnection(URL, USER, PWD);
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<BoardVO> list = dao.listBoards();
		System.out.println(list);
	}
}
