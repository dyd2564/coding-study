package exam09;

import java.util.*;

public class MemberDaoMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = null;
		String command = null;
		
		// DB ����
		while(true) {
			System.out.println(">>DB ���� : 1. ����Ŭ | 2. MySQL | 3. ����");
			command = sc.nextLine();
			if(command.equals("1")) {
				// ����Ŭ exam09.MemberDaoByOracle
				choice = MemberDao.ORACLE_DB;
				break;
			} 
			else if (command.equals("2")) {
				// MySQL exam09.MemberDaoByMySQL
				choice = MemberDao.MYSQL_DB;
				break;
			}
			else if (command.equals("3")) {
				// ����
				System.out.println("����");
				return;
			}
			else {
				System.out.println("�ٽ� �����ϼ���");
			}
		} // DB ���� end
		
		try {
			Class<?> clazz = Class.forName(choice);
			MemberDao dao = (MemberDao) clazz.getDeclaredConstructor().newInstance();
		    dao.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
