package section2.exam13;

import java.util.*;

public class BoardVO {
	private int id; // �Խñ� ��ȣ
	private String title; // ����
	private String contents; // ����
	private String writter; // �ۼ���
	private int hit; // ��ȸ��
	private String like; // ���ƿ�
	private Date regDate; // �����
	private Date updateDate; // ������
	private int replyCount; // ��� ��
	

	// ������(�ʿ信 ���� ��� ����ص� ����)
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
