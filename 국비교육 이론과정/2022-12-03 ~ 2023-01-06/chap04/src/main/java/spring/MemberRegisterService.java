package spring;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	
	@Autowired
	private MemberDao memberDao; 
	
	public MemberRegisterService() {
	
	}
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao; 
	}
	
	public Long register(RegisterRequest req) {
		// 이메일로 회원 데이터 조회 
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member!=null) { // 사용자가 입력한 이메일이 있다면...
			throw new DuplicateMemberException("dup email : " + req.getEmail());
		}
		// 사용자가 입력한 이메일이 없다면...
		Member newMember = new Member(
				req.getEmail(), 
				req.getPassword(), 
				req.getName(), 
				LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
