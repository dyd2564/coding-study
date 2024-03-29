package com.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MemberVO {
	private int mno; 
	private String id; 
	private String pwd; 
	private String name; 
	private String email; 
	private Date date; 
	private MemberGrade grade;
	
	public enum MemberGrade{
		ROLE_ADMIN, ROLE_MEMBER
	}
}
