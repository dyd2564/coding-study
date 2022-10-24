package exam08;

public class MemberService {

	private MemberDao memberDao;
	
	public MemberService() {}
	
	public MemberService(final MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public Member[] memberList() {
		return memberDao.selectAll();
	}
}
