package exam04;

public interface MemberMain {
	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		try {
			MemberVO member = dao.findById(3);
			System.out.println(member);
			MemberVO member2 = dao.findById(4);
			System.out.println(member2);
			MemberVO member3 = dao.findById(100); // ���� �߻� ����
		} catch (NotFoundMemberException e) {
			System.out.println(e.getMessage());
			System.out.println("ȸ����ȣ�� �ٸ��� �Է��ϼ���.");
		}
		
	}
}
