package exam04;

import java.util.List;

public interface MemberDao {
	
	// 모든 회원 조회
	List<MemberVO> memberList();
	
	// id로 회원정보 찾기
	MemberVO findById(int id);
}
