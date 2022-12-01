package sec01.ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	
	private DataSource dataSource; 
	
	public MemberDAO(){
		try {
			Context ctx = new InitialContext();
			Context envCtx = (Context) ctx.lookup("java:/comp/env");
			dataSource = (DataSource) envCtx.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원 목록 
	public List<MemberVO> listMembers(){
		List<MemberVO> list = new ArrayList<>();
		String query = "select * from t_member order by joinDate desc";
		
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				MemberVO vo = new MemberVO(
					rs.getInt("mno"), 
					rs.getString("id"),
					rs.getString("pwd"), 
					rs.getString("name"), 
					rs.getString("email"), 
					rs.getDate("joinDate"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list; 
	}
	
	// 회원 가입
	public void addMember(MemberVO vo) {
		String query = "insert into t_member(mno,id,pwd,name,email) values(MNO_SEQ.nextval,?,?,?,?)";
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원상세정보
	public MemberVO findMember(String id) {
		MemberVO vo = null;
		String query = "select * from t_member where id=?";
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setString(1, id);
			try(ResultSet rs = pstmt.executeQuery();){
				if(rs.next()) {
				  vo = new MemberVO(
					rs.getInt("mno"),
					rs.getString("id"),
					rs.getString("pwd"), 
					rs.getString("name"), 
					rs.getString("email"), 
					rs.getDate("joinDate"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo; 
	}
	
	// 회원삭제 
	public void delMember(int mno) {
		String query = "delete from t_member where mno=?";
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setInt(1, mno);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원수정
	public void modMember(MemberVO vo) {
		String query = "update t_member set pwd=?, name=?,email=? where id=?";
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setString(1, vo.getPwd());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
