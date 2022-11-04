package sec01.ex04;

import java.sql.Date;

public class BoardVO {
	
	private String bNo;
	private String title;
	private String content;
	private String writter;
	private Date regDate;
	private Date updateDate;
	
	public BoardVO(String bNo, String title, String content, String writter, Date regDate, Date updateDate) {
		this.bNo = bNo;
		this.title = title;
		this.content = content;
		this.writter = writter;
		this.regDate = regDate;
		this.updateDate = updateDate;
	}
	
	public BoardVO(String bNo, String title, String content, String writter) {
		this.bNo = bNo;
		this.title = title;
		this.content = content;
		this.writter = writter;
		
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
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

	@Override
	public String toString() {
		return "BoardVO [bNo=" + bNo + ", title=" + title + ", content=" + content + ", writter=" + writter
				+ ", regDate=" + regDate + ", updateDate=" + updateDate + "]";
	}
	
	

	
	
}
