package exam09;

public class MemberDaoByOracle implements MemberDao {

	@Override
	public void selectAll() {
		System.out.println("오라클 데이터베이스 조회");
	}

}
