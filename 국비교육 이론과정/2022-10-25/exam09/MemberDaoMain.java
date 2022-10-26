package exam09;

import java.util.*;

public class MemberDaoMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = null;
		String command = null;
		
		// DB 선택
		while(true) {
			System.out.println(">>DB 선택 : 1. 오라클 | 2. MySQL | 3. 종료");
			command = sc.nextLine();
			if(command.equals("1")) {
				// 오라클 exam09.MemberDaoByOracle
				choice = MemberDao.ORACLE_DB;
				break;
			} 
			else if (command.equals("2")) {
				// MySQL exam09.MemberDaoByMySQL
				choice = MemberDao.MYSQL_DB;
				break;
			}
			else if (command.equals("3")) {
				// 종료
				System.out.println("종료");
				return;
			}
			else {
				System.out.println("다시 선택하세요");
			}
		} // DB 선택 end
		
		try {
			Class<?> clazz = Class.forName(choice);
			MemberDao dao = (MemberDao) clazz.getDeclaredConstructor().newInstance();
		    dao.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
