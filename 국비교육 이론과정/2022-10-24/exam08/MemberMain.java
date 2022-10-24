package exam08;

import java.util.Arrays;

public class MemberMain {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberService memberService = new MemberService(memberDao);
		Member[] members = memberService.memberList();
		
		for (Member m : members) {
			System.out.println("============================");
			System.out.println("�̸� : " + m.getName());
			System.out.println("���� : " + m.getAge());
		}
	}
}
