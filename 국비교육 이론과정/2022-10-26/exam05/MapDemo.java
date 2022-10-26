package exam05;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
		// ����Ÿ�� ��ü�� Key�� ���
		Member member1 = new Member(1, "�迵��");
		Member member2 = new Member(2, "�����");
		Member member3 = new Member(3, "������");
		
		Map<Member, String> map = new HashMap<>();
		map.put(member1, "���ѱ���");
		map.put(member2, "��õ����ִ�");
		map.put(member3, "�������ֿ��մ�");
		
		System.out.println(map.get(member1));
		System.out.println(map.get(member2));
		System.out.println(map.get(member3));
		
		System.out.println(map.get(new Member(1, "�迵��")));
		
		System.out.println("=================================");
		System.out.println(member1.hashCode());
		System.out.println(new Member(1, "�迵��").hashCode());
		
		System.out.println(member1.toString());
		System.out.println(member2);
		
		Date now = new Date();
		
	}
}
