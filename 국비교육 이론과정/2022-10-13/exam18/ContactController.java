package exam18;

import java.util.*;

public class ContactController {
	
	private ContactDaoByMySQL dao = new ContactDaoByMySQL();
	
	public void Start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 : ���α׷� ���� | 1 : ����ó ��� | 2 : ����ó �߰� | 3 : ����ó ����");
		
		while(true) {
			System.out.print(">> ��ɾ� �Է� : ");
			switch (sc.next()) {
			case "0":
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); // ���ν����� ����
				break;
			case "1":
				System.out.println("����ó ��� ����");
				dao.contactList();
				break;
			case "2":
				System.out.println("����ó �߰�");
				System.out.print(">> �̸� �Է� : ");
				String name = sc.next();
				System.out.print(">> ����ó �Է� : ");
				String phoneNumber = sc.next();
				dao.addContact(new Contact(name, phoneNumber));
				System.out.println("����ó �߰� �Ϸ�");
				break;
//			case "3":
//				System.out.println("����ó ����");
//				System.out.print(">> �̸� �Է� : ");
//				String name = sc.next();
//				System.out.print(">> ����ó �Է� : ");
//				String phoneNumber = sc.next();
//				dao.removeContact(name1, phoneNumber1);
//				System.out.println("����ó ���� �Ϸ�");
//				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		} // while end
	} // main end
}
