package exam02;

public class MemberMain {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberService memberService = new MemberService();
		memberService.setMemberDao(memberDao);
		memberService.memberList();
	}
}
