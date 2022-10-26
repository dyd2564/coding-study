package exam02;

public class MemberService {

	private MemberDao memberDao;
	
	// 세터 주입
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void memberList() {
		try {
			memberDao.selectAll();
			
		} catch (Exception e) {
			System.out.println("DAO 객체가 할당되지 않았습니다.");
		}
	}
}
