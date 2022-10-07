package section2.exam13;

import java.util.*;

public class BoardVO {
	private int id; // 게시글 번호
	private String title; // 제목
	private String contents; // 내용
	private String writter; // 작성자
	private int hit; // 조회수
	private String like; // 좋아요
	private Date regDate; // 등록일
	private Date updateDate; // 수정일
	private int replyCount; // 댓글 수
	

	// 생성자(필요에 따라 몇개만 사용해도 가능)
	public BoardVO(String title, String contents, String writter) {
		this.title = title;
		this.contents = contents;
		this.writter = writter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	
	
	
}
