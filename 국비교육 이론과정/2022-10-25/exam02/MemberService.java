package exam02;

public class MemberService {

	private MemberDao memberDao;
	
	// ���� ����
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void memberList() {
		try {
			memberDao.selectAll();
			
		} catch (Exception e) {
			System.out.println("DAO ��ü�� �Ҵ���� �ʾҽ��ϴ�.");
		}
	}
}
