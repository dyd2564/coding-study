package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.common.ConnectionUtil;
import com.domain.BoardVO;

public class BoardDao {
	
	private DataSource dataSource;
	
	public BoardDao() {
		dataSource = ConnectionUtil.getDatasource();
	}
	
	// 글 목록
	public List<BoardVO> selectAll() {
		String query = "select * from board_tbl order by bno desc";
		List<BoardVO> list = new ArrayList();
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				BoardVO vo = BoardVO.builder()
					.bno(rs.getInt("bno"))
					.title(rs.getString("title"))
					.content(rs.getString("content"))
					.writer(rs.getString("writer"))
					.writeDate(rs.getDate("writeDate"))
					.imageFileName(rs.getString("imageFileName"))
					.build();
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 글쓰기
	public int insertBoard(BoardVO vo) {
		String query = "INSERT INTO BOARD_TBL(BNO,TITLE,CONTENT,WRITER,imageFileName) VALUES (?,?,?,?,?)";
		int boardNo = getNewBno();
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setInt(1, boardNo);
			pstmt.setString(2,vo.getTitle());
			pstmt.setString(3,vo.getContent());
			pstmt.setString(4,vo.getWriter());
			pstmt.setString(5,vo.getImageFileName());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardNo;
	}
	
	// 새로운 글번호 생성 
	public int getNewBno() {
		int boardNo = 0; 
		String query = "SELECT MAX(BNO)+1 as boardNO FROM BOARD_TBL";
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
		){
			if(rs.next()) {
				boardNo = rs.getInt("boardNO");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardNo;
	}
	
	// 글 상세 
	public BoardVO selectOne(int bno) {
		BoardVO vo = null; 
		String query = "select * from board_tbl where bno=?";
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setInt(1, bno);
			try(ResultSet rs = pstmt.executeQuery();){
				if(rs.next()) {
					vo = BoardVO.builder()
						.bno(rs.getInt("bno"))
						.title(rs.getString("title"))
						.content(rs.getString("content"))
						.writer(rs.getString("writer"))
						.writeDate(rs.getDate("writeDate"))
						.imageFileName(rs.getString("imageFileName"))
						.build();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo; 
	}
	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		
		String imageFileName = vo.getImageFileName();
		int bno = vo.getBno();
		
		String query = "update board_tbl set title=?,content=?";
		// update board_tbl set title=?,content=? where bno = ?
		// update board_tbl set title=?,content=?, imageFileName=? where bno = ?
		if(imageFileName!=null) { // 이미지 파일이 있을 때
			query+=",imageFileName=? where bno=?";
		} else { // 이미지 파일이 없을 때 
			query+=" where bno=?";
		}
		
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		){
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			if(imageFileName!=null) { // 이미지 파일이 있을 때
				pstmt.setString(3, imageFileName);
				pstmt.setInt(4, bno);
			} else { // 이미지 파일이 없을 때
				pstmt.setInt(3, bno);
			}
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 삭제 처리 
	public void deleteBoard(int bno) {
		String query = "delete from board_tbl where bno=?";
		try (
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);	
		){
			pstmt.setInt(1, bno);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
