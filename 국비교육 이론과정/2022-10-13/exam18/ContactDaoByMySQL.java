package exam18;

import java.util.*;

public class ContactDaoByMySQL {

	private static List<Contact> list = new ArrayList<>();
	
	static {
		list.add(new Contact("엄마", "00000000"));
		list.add(new Contact("아빠", "11111111"));
		list.add(new Contact("형", "22222222"));
		list.add(new Contact("동생", "33333333"));
	}
	
	
	// 연착처 추가
	public void addContact(Contact contact) {
		list.add(contact);
	}
	
	// 연락처 목록
	public void contactList() {
		print();
	}
	
	
//	// 연락처 삭제
//	public void removeContact(Contact contact) {
//		list.remove(contact);
//		
//	}
	
	public void print() {
		for (Contact c : list) {
			System.out.println("이름 : " + c.getName() + " | 연락처 : " + c.getPhoneNumber());
		}
	}
}
