package com.jafa.spring;

import org.springframework.stereotype.Component;

@Component
public class MemberDao2 {
	
	public void insert() {
		System.out.println("memberDao2");
		System.out.println("회원가입");
	}
}