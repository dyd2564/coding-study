package exam05;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		
		// ÂüÁ¶Å¸ÀÔ °´Ã¼¸¦ Key·Î »ç¿ë
		Member member1 = new Member(1, "±è¿µ»ï");
		Member member2 = new Member(2, "±è´ëÁß");
		Member member3 = new Member(3, "±èÁ¾ÇÊ");
		
		Map<Member, String> map = new HashMap<>();
		map.put(member1, "½ÅÇÑ±¹´ç");
		map.put(member2, "»õÃµ³â¹ÎÁÖ´ç");
		map.put(member3, "ÀÚÀ¯¹ÎÁÖ¿¬ÇÕ´ç");
		
		System.out.println(map.get(member1));
		System.out.println(map.get(member2));
		System.out.println(map.get(member3));
		
		System.out.println(map.get(new Member(1, "±è¿µ»ï")));
		
		System.out.println("=================================");
		System.out.println(member1.hashCode());
		System.out.println(new Member(1, "±è¿µ»ï").hashCode());
		
		System.out.println(member1.toString());
		System.out.println(member2);
		
		Date now = new Date();
		
	}
}
