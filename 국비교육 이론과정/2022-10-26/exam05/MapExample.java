package exam05;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("국어", 81);
		// key 중복 : value가 수정된다.
		map.put("국어", 90);
		map.put("수학", 85);
		map.put("영어", 81);
		map.put("과학", 85);
		System.out.println(map);
		
		// key로 value 가져오기 : get(key)
		int korScore = map.get("국어");
		System.out.println("국어 점수 : " + korScore);
		
		// 생성자의 제네릭 타입은 생략할 수 있음
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "홍길동");
		map2.put(2, "김민수");
		String memberName = map2.get(2);
		System.out.println(memberName);
		
		
	}
}
