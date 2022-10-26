package exam03;

public class MemberMain {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberService memberService = new MemberService(memberDao);
		memberService.memberList();
	}
}
