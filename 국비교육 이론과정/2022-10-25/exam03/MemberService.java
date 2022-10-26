package exam03;

public class MemberService {

	private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
	}
	
	public void MemberService(final MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void memberList() {
		memberDao.selectAll();
	}
}
