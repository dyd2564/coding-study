package exam09;

public interface MemberDao {
	
	String ORACLE_DB = "exam09.MemberDaoByOracle";
	String MYSQL_DB = "exam09.MemberDaoByMySQL";
	
	void selectAll();
}
