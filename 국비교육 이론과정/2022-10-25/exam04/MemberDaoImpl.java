package exam04;

import java.util.ArrayList;
import java.util.List;

public class MemberDaoImpl implements MemberDao {

	private List<MemberVO> memberList = new ArrayList<MemberVO>();
	// MemberVO[] members;
	
	public MemberDaoImpl() {
		memberList.add(new MemberVO(1, "��μ�"));
		memberList.add(new MemberVO(2, "�ڹμ�"));
		memberList.add(new MemberVO(3, "�ֹμ�"));
		memberList.add(new MemberVO(4, "���μ�"));
	}
	
	@Override
	public List<MemberVO> memberList() {
		return this.memberList;
	}

	@Override
	public MemberVO findById(int id) {
		MemberVO vo = null;
		for (MemberVO m : memberList) {
			if (m.getId() == id) {
				vo = m;
				break;
			}
		}
		if (vo == null) throw new NotFoundMemberException("�������� �ʴ� ȸ���Դϴ�.");
		return vo;
	}

}
