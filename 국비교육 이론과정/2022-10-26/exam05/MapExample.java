package exam05;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("����", 81);
		// key �ߺ� : value�� �����ȴ�.
		map.put("����", 90);
		map.put("����", 85);
		map.put("����", 81);
		map.put("����", 85);
		System.out.println(map);
		
		// key�� value �������� : get(key)
		int korScore = map.get("����");
		System.out.println("���� ���� : " + korScore);
		
		// �������� ���׸� Ÿ���� ������ �� ����
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "ȫ�浿");
		map2.put(2, "��μ�");
		String memberName = map2.get(2);
		System.out.println(memberName);
		
		
	}
}
