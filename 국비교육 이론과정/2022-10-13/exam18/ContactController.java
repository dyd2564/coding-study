package exam18;

import java.util.*;

public class ContactController {
	
	private ContactDaoByMySQL dao = new ContactDaoByMySQL();
	
	public void Start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 : 프로그램 종료 | 1 : 연락처 목록 | 2 : 연락처 추가 | 3 : 연락처 삭제");
		
		while(true) {
			System.out.print(">> 명령어 입력 : ");
			switch (sc.next()) {
			case "0":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 메인스레드 종료
				break;
			case "1":
				System.out.println("연락처 목록 보기");
				dao.contactList();
				break;
			case "2":
				System.out.println("연락처 추가");
				System.out.print(">> 이름 입력 : ");
				String name = sc.next();
				System.out.print(">> 연락처 입력 : ");
				String phoneNumber = sc.next();
				dao.addContact(new Contact(name, phoneNumber));
				System.out.println("연락처 추가 완료");
				break;
//			case "3":
//				System.out.println("연락처 삭제");
//				System.out.print(">> 이름 입력 : ");
//				String name = sc.next();
//				System.out.print(">> 연락처 입력 : ");
//				String phoneNumber = sc.next();
//				dao.removeContact(name1, phoneNumber1);
//				System.out.println("연락처 삭제 완료");
//				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		} // while end
	} // main end
}
