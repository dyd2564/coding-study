package exam04;

import java.util.List;

public interface MemberDao {
	
	// ��� ȸ�� ��ȸ
	List<MemberVO> memberList();
	
	// id�� ȸ������ ã��
	MemberVO findById(int id);
}
