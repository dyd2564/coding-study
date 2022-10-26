package exam09;

public class MemberDaoByMySQL implements MemberDao {

	@Override
	public void selectAll() {
		System.out.println("MySQL 데이터베이스로 조회");
	}

}
